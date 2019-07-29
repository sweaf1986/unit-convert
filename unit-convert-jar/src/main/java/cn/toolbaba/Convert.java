package cn.toolbaba;

import cn.toolbaba.defs.DefEnumItf;
import cn.toolbaba.defs.Length;

import java.math.BigDecimal;

/**
 * @ClassName Convert
 * @Description 单位转换入口
 * @Author 0003653 葱油饼
 * @Date 2019-07-28 09:34
 **/
public class Convert {

    private DefEnumItf from;

    private DefEnumItf to;

    /**
     * 计算精度
     */
    private Integer accuracy;

    public Convert(DefEnumItf from) {
        if (from == null) {
            throw new IllegalArgumentException("|from| can not be empty!");
        }
        this.accuracy = from.getAccuracy();
        this.from = from;
    }

    public static Convert from(DefEnumItf from) {
        return new Convert(from);
    }

    public Convert to(DefEnumItf to) {
        if (to == null) {
            throw new IllegalArgumentException("|to| can not be empty!");
        }
        this.to = to;
        return this;
    }

    public Integer getAccuracy() {
        return accuracy;
    }

    public Convert setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    public BigDecimal calculate(BigDecimal fromSource) {
        if (fromSource == null) {
            throw new IllegalArgumentException("|fromSource| can not be empty!");
        }

        fromSource = fromSource.setScale(getAccuracy());


        BigDecimal result = fromSource.multiply(from.getDefInfo().getToAnchor()).divide(to.getDefInfo().getToAnchor(), BigDecimal.ROUND_HALF_UP);

        return result;
    }


    public static void main(String[] args) {
        BigDecimal result = Convert.from(Length.LY).to(Length.M).setAccuracy(0).calculate(new BigDecimal(1));
        System.out.println(result.toPlainString());
    }


}
