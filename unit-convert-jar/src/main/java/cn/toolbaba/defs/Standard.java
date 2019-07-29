package cn.toolbaba.defs;

/**
 * 制式枚举
 *
 * @author 0003653
 */
public enum Standard {

    METRIC("公制", "Metric system"),
    BRITISH("英制", "British system"),
    MUNICIPAL("市制", "Municipal system");
    String chName;
    String enName;

    Standard(String chName, String enName) {
        this.chName = chName;
        this.enName = enName;
    }

    public String getChName() {
        return chName;
    }

    public Standard setChName(String chName) {
        this.chName = chName;
        return this;
    }

    public String getEnName() {
        return enName;
    }

    public Standard setEnName(String enName) {
        this.enName = enName;
        return this;
    }}
