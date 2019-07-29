package cn.toolbaba.defs;

import java.math.BigDecimal;

/**
 * 压力定义
 *
 * @author sweaf
 */
public enum Power implements DefEnumItf {

    W(new DefInfo("w", "W", "瓦", new BigDecimal(1d), Standard.MUNICIPAL)),
    KW(new DefInfo("kw", "KW", "千瓦", new BigDecimal(1000d), Standard.MUNICIPAL)),
    HP(new DefInfo("hp", "HP", "英制马力", new BigDecimal(745.699872d), Standard.MUNICIPAL)),
    PS(new DefInfo("ps", "PS", "米制马力", new BigDecimal(735.49875d), Standard.MUNICIPAL)),
    KGM_S(new DefInfo("kg·m/s", "KG·M/S", "公斤·米/秒", new BigDecimal(9.80665d), Standard.MUNICIPAL)),
    KCAL_S(new DefInfo("kcal/s", "KCAL/S", "千卡/秒", new BigDecimal(4184.1004d), Standard.MUNICIPAL)),
    FTLB_S(new DefInfo("ft·lb/s", "FT·LB/S", "英尺·磅/秒", new BigDecimal(1.3558179d), Standard.MUNICIPAL)),
    J_S(new DefInfo("j/s", "J/S", "焦耳/秒", new BigDecimal(1d), Standard.MUNICIPAL)),
    NM_S(new DefInfo("n·m/s", "N·M/S", "牛顿·米/秒", new BigDecimal(1d), Standard.MUNICIPAL)),
    ;

    DefInfo defInfo;

    Power(DefInfo defInfo) {
        this.defInfo = defInfo;
    }

    public DefEnumItf getBenchmarking() {
        return Power.W;
    }

    public int getAccuracy() {
        return 10;
    }

    public DefInfo getDefInfo() {
        return this.defInfo;
    }


}
