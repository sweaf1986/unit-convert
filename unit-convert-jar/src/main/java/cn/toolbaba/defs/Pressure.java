package cn.toolbaba.defs;

import java.math.BigDecimal;

/**
 * 压力定义
 *
 * @author sweaf
 */
public enum Pressure implements DefEnumItf {

    PA(new DefInfo("pa", "Pa", "帕斯卡", new BigDecimal(1d), Standard.MUNICIPAL)),
    MPA(new DefInfo("mpa", "MPa", "兆帕", new BigDecimal(1000000d), Standard.MUNICIPAL)),
    KPA(new DefInfo("kpa", "KPa", "千帕", new BigDecimal(1000d), Standard.MUNICIPAL)),
    HPA(new DefInfo("hpa", "HPa", "百帕", new BigDecimal(100d), Standard.MUNICIPAL)),
    ATM(new DefInfo("atm", "ATM", "标准大气压", new BigDecimal(101325d), Standard.MUNICIPAL)),
    MMHG(new DefInfo("mmhg", "mmHg", "毫米汞柱", new BigDecimal(133.3223684d), Standard.MUNICIPAL)),
    MMH2O(new DefInfo("mmh2o", "mmH2o", "毫米水柱", new BigDecimal(9.8066136d), Standard.MUNICIPAL)),
    INHG(new DefInfo("inhg", "inHg", "英寸汞柱", new BigDecimal(3386.3881579d), Standard.MUNICIPAL)),
    BAR(new DefInfo("bar", "BAR", "巴", new BigDecimal(100000d), Standard.MUNICIPAL)),
    MBAR(new DefInfo("mbar", "MBAR", "毫巴", new BigDecimal(100d), Standard.MUNICIPAL)),
    PSF(new DefInfo("psf", "PSF", "磅力/平方英尺", new BigDecimal(47.8802569d), Standard.MUNICIPAL)),
    PSI(new DefInfo("psi", "PSI", "磅力/平方英寸", new BigDecimal(6894.757d), Standard.MUNICIPAL)),
    KG_SQ_CM(new DefInfo("kgf/cm²", "KGF/CM²", "公斤力/平方厘米", new BigDecimal(98066.5d), Standard.MUNICIPAL)),
    KG_SQ_M(new DefInfo("kgf/m²", "KGF/M²", "公斤力/平方米", new BigDecimal(9.80665d), Standard.MUNICIPAL)),

    ;

    DefInfo defInfo;

    Pressure(DefInfo defInfo) {
        this.defInfo = defInfo;
    }

    public DefEnumItf getBenchmarking() {
        return Pressure.PA;
    }

    public int getAccuracy() {
        return 10;
    }

    public DefInfo getDefInfo() {
        return this.defInfo;
    }


}
