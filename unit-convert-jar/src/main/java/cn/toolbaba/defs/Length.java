package cn.toolbaba.defs;

import java.math.BigDecimal;

/**
 * 长度定义
 *
 * @author sweaf
 */
public enum Length implements DefEnumItf {

    PM(new DefInfo("pm", "PM", "皮米", new BigDecimal(0.0000000001d), Standard.METRIC)),
    NM(new DefInfo("nm", "NM", "纳米", new BigDecimal(0.0000001d), Standard.METRIC)),
    UM(new DefInfo("um", "UM", "微米", new BigDecimal(0.0001d), Standard.METRIC)),
    MM(new DefInfo("mm", "MM", "毫米", new BigDecimal(0.1d), Standard.METRIC)),
    CM(new DefInfo("cm", "CM", "厘米", new BigDecimal(1), Standard.METRIC)),
    DM(new DefInfo("dm", "DM", "分米", new BigDecimal(1 * 10), Standard.METRIC)),
    M(new DefInfo("m", "M", "米", new BigDecimal(1 * 100), Standard.METRIC)),
    KM(new DefInfo("km", "KM", "千米", new BigDecimal(1 * 100 * 1000), Standard.METRIC)),
    AU(new DefInfo("au", "au", "天文单位", new BigDecimal(1 * 100 * 1000 * 149600000), Standard.METRIC)),
    LY(new DefInfo("ly", "LY", "光年", new BigDecimal(1 * 100 * 1000).multiply(new BigDecimal("9460730472581")), Standard.METRIC)),

    IN(new DefInfo("in", "IN", "英寸", new BigDecimal(2.54d), Standard.BRITISH)),
    FT(new DefInfo("ft", "FT", "英尺", new BigDecimal(30.48d), Standard.BRITISH)),
    YD(new DefInfo("yd", "YD", "码", new BigDecimal(91.44d), Standard.BRITISH)),
    FM(new DefInfo("fm", "FM", "英寻", new BigDecimal(182.88d), Standard.BRITISH)),
    FUR(new DefInfo("fur", "FUR", "弗隆", new BigDecimal(20116.8d), Standard.BRITISH)),
    MI(new DefInfo("mi", "MI", "英里", new BigDecimal(160934.4d), Standard.BRITISH)),
    NMI(new DefInfo("nmi", "NMI", "海里", new BigDecimal(185200d), Standard.BRITISH)),

    HAO(new DefInfo("hao", "HAO", "毫", new BigDecimal(0.0033333333d), Standard.MUNICIPAL)),
    LI(new DefInfo("li", "LI", "厘", new BigDecimal(0.0333333333d), Standard.MUNICIPAL)),
    FEN(new DefInfo("fen", "FEN", "分", new BigDecimal(0.3333333333d), Standard.MUNICIPAL)),
    CUN(new DefInfo("cun", "CUN", "寸", new BigDecimal(3.3333333333d), Standard.MUNICIPAL)),
    CHI(new DefInfo("chi", "CHI", "尺", new BigDecimal(33.3333333333d), Standard.MUNICIPAL)),
    ZHANG(new DefInfo("zhang", "ZHANG", "丈", new BigDecimal(333.3333333333d), Standard.MUNICIPAL)),
    LI_BIG(new DefInfo("li_big", "LI_BIG", "里", new BigDecimal(50000d), Standard.MUNICIPAL));

    DefInfo defInfo;

    Length(DefInfo defInfo) {
        this.defInfo = defInfo;
    }

    public DefEnumItf getBenchmarking() {
        return Length.CM;
    }

    public int getAccuracy() {
        return 10;
    }

    public DefInfo getDefInfo() {
        return this.defInfo;
    }


}
