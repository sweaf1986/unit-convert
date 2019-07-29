package cn.toolbaba.defs;

import java.math.BigDecimal;

/**
 * 体积定义
 *
 * @author sweaf
 */
public enum Volume implements DefEnumItf {


    CU_MM(new DefInfo("mm³", "MM³", "立方毫米", new BigDecimal(0.001d), Standard.MUNICIPAL)),
    CU_CM(new DefInfo("cm³", "CM³", "立方厘米", new BigDecimal(1d), Standard.MUNICIPAL)),
    CU_DM(new DefInfo("dm³", "DM³", "立方分米", new BigDecimal(1000d), Standard.MUNICIPAL)),
    CU_M(new DefInfo("m³", "M³", "立方米", new BigDecimal(1000000d), Standard.MUNICIPAL)),
    UL(new DefInfo("ul", "UL", "微升", new BigDecimal(0.001d), Standard.MUNICIPAL)),
    ML(new DefInfo("ml", "ML", "毫升", new BigDecimal(1d), Standard.MUNICIPAL)),
    CL(new DefInfo("cl", "CL", "厘升", new BigDecimal(10d), Standard.MUNICIPAL)),
    DL(new DefInfo("dl", "DL", "分升", new BigDecimal(100d), Standard.MUNICIPAL)),
    L(new DefInfo("l", "L", "升", new BigDecimal(1000d), Standard.MUNICIPAL)),
    HL(new DefInfo("hl", "HL", "公石", new BigDecimal(100000d), Standard.MUNICIPAL)),

    CU_FT(new DefInfo("cu ft", "CU FT", "立方英尺", new BigDecimal(28316.8d), Standard.BRITISH)),
    CU_IN(new DefInfo("cu in", "CU IN", "立方英寸", new BigDecimal(16.387037d), Standard.BRITISH)),
    CU_YD(new DefInfo("cu yd", "CU YD", "立方码", new BigDecimal(764553.6d), Standard.BRITISH)),
    ACRE_FEET(new DefInfo("acre feet", "ACRE FEET", "亩英尺", new BigDecimal(1233481837.548d), Standard.BRITISH)),
    UK_GAL(new DefInfo("uk gal", "UK GAL", "英制加仑", new BigDecimal(4546.09188d), Standard.BRITISH)),
    US_GAL(new DefInfo("us gal", "US GAL", "美制加仑", new BigDecimal(3785.411784d), Standard.BRITISH)),
    UK_OZ(new DefInfo("uk oz", "UK OZ", "英制液体盎司", new BigDecimal(28.41d), Standard.BRITISH)),
    US_OZ(new DefInfo("us oz", "US OZ", "美制液体盎司", new BigDecimal(29.57d), Standard.BRITISH)),
    ;

    DefInfo defInfo;

    Volume(DefInfo defInfo) {
        this.defInfo = defInfo;
    }

    public DefEnumItf getBenchmarking() {
        return Volume.CU_CM;
    }

    public int getAccuracy() {
        return 10;
    }

    public DefInfo getDefInfo() {
        return this.defInfo;
    }


}
