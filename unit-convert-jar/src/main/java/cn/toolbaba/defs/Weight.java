package cn.toolbaba.defs;

import java.math.BigDecimal;

/**
 * 重量定义
 *
 * @author sweaf
 */
public enum Weight implements DefEnumItf {


    KG(new DefInfo("kg", "KG", "千克", new BigDecimal(1000d), Standard.MUNICIPAL)),
    G(new DefInfo("g", "G", "克", new BigDecimal(1d), Standard.MUNICIPAL)),
    MG(new DefInfo("mg", "MG", "毫克", new BigDecimal(0.001d), Standard.MUNICIPAL)),
    UG(new DefInfo("μg", "UG", "微克", new BigDecimal(0.0000001d), Standard.MUNICIPAL)),
    T(new DefInfo("t", "T", "吨", new BigDecimal(1000000d), Standard.MUNICIPAL)),
    Q(new DefInfo("q", "Q", "公担", new BigDecimal(100000d), Standard.MUNICIPAL)),
    CT(new DefInfo("ct", "CT", "克拉", new BigDecimal(0.2d), Standard.MUNICIPAL)),
    POINT(new DefInfo("point", "POINT", "分", new BigDecimal(0.002d), Standard.MUNICIPAL)),

    LB(new DefInfo("lb", "LB", "磅", new BigDecimal(453.59237d), Standard.BRITISH)),
    OZ(new DefInfo("oz", "OZ", "盎司", new BigDecimal(28.3495231d), Standard.BRITISH)),
    GR(new DefInfo("gr", "GR", "格令", new BigDecimal(0.0647989d), Standard.BRITISH)),
    LT(new DefInfo("lt", "LT", "长吨", new BigDecimal(1016046.9088d), Standard.BRITISH)),
    ST(new DefInfo("st", "ST", "短吨", new BigDecimal(907184.74d), Standard.BRITISH)),
    UK_Q(new DefInfo("uk q", "UK Q", "英担", new BigDecimal(50802.34544d), Standard.BRITISH)),
    US_Q(new DefInfo("us q", "US Q", "美担", new BigDecimal(45359.237d), Standard.BRITISH)),
    UK_ST(new DefInfo("uk st", "UK ST", "英石", new BigDecimal(6350.29318d), Standard.BRITISH)),
    DR(new DefInfo("dr", "DR", "打兰", new BigDecimal(1.7718452d), Standard.BRITISH)),

    DAN(new DefInfo("dan", "DAN", "担", new BigDecimal(50000d), Standard.MUNICIPAL)),
    JIN(new DefInfo("jin", "JIN", "斤", new BigDecimal(500d), Standard.MUNICIPAL)),
    LIANG(new DefInfo("liang", "LIANG", "两", new BigDecimal(50d), Standard.MUNICIPAL)),
    QIAN(new DefInfo("qian", "QIAN", "钱", new BigDecimal(5d), Standard.MUNICIPAL)),

    ;

    DefInfo defInfo;

    Weight(DefInfo defInfo) {
        this.defInfo = defInfo;
    }

    public DefEnumItf getBenchmarking() {
        return Weight.G;
    }

    public int getAccuracy() {
        return 10;
    }

    public DefInfo getDefInfo() {
        return this.defInfo;
    }


}
