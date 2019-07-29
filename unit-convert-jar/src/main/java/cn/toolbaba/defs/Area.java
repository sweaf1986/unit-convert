package cn.toolbaba.defs;

import java.math.BigDecimal;

/**
 * 面积定义
 *
 * @author sweaf
 */
public enum Area implements DefEnumItf {

    SQ_MM(new DefInfo("mm²", "MM²", "平方毫米", new BigDecimal(0.01d), Standard.MUNICIPAL)),
    SQ_CM(new DefInfo("cm²", "CM²", "平方厘米", new BigDecimal(1d), Standard.MUNICIPAL)),
    SQ_DM(new DefInfo("dm²", "DM²", "平方分米", new BigDecimal(100d), Standard.MUNICIPAL)),
    SQ_M(new DefInfo("m²", "M²", "平方米", new BigDecimal(10000d), Standard.MUNICIPAL)),
    ARE(new DefInfo("are", "ARE", "公亩", new BigDecimal(1000000d), Standard.MUNICIPAL)),
    HA(new DefInfo("ha", "HA", "公顷", new BigDecimal(100000000d), Standard.MUNICIPAL)),
    SQ_KM(new DefInfo("km²", "KM²", "平方千米", new BigDecimal(10000000000d), Standard.MUNICIPAL)),

    ACRE(new DefInfo("acre", "ACRE", "英亩", new BigDecimal(40468564.224d), Standard.BRITISH)),
    SQ_MI(new DefInfo("sq.mi", "SQ.MI", "平方英里", new BigDecimal(25899881103.36d), Standard.BRITISH)),
    SQ_YD(new DefInfo("sq.yd", "SQ.YD", "平方码", new BigDecimal(8361.2736d), Standard.BRITISH)),
    SQ_FT(new DefInfo("sq.ft", "SQ.FT", "平方英尺", new BigDecimal(929.0304d), Standard.BRITISH)),
    SQ_IN(new DefInfo("sq.in", "SQ.IN", "平方英寸", new BigDecimal(6.4516d), Standard.BRITISH)),
    SQ_RD(new DefInfo("sq.rd", "SQ.RD", "平方竿", new BigDecimal(252928.5264d), Standard.BRITISH)),

    SQ_CUN(new DefInfo("sq.cun", "SQ.CUN", "平方寸", new BigDecimal(11.1111111d), Standard.MUNICIPAL)),
    SQ_CHI(new DefInfo("sq.chi", "SQ.CHI", "平方尺", new BigDecimal(1111.1111111d), Standard.MUNICIPAL)),
    FEN(new DefInfo("fen", "FEN", "分", new BigDecimal(666666.6666666667d), Standard.MUNICIPAL)),
    MU(new DefInfo("mu", "MU", "亩", new BigDecimal(6666666.6666666667d), Standard.MUNICIPAL)),
    QING(new DefInfo("qing", "QING", "顷", new BigDecimal(666666666.6666666667d), Standard.MUNICIPAL));

    DefInfo defInfo;

    Area(DefInfo defInfo) {
        this.defInfo = defInfo;
    }

    public DefEnumItf getBenchmarking() {
        return Area.SQ_CM;
    }

    public int getAccuracy() {
        return 10;
    }

    public DefInfo getDefInfo() {
        return this.defInfo;
    }


}
