package cn.toolbaba.defs;

/**
 * @author 0003653
 */
public interface DefEnumItf {

    /**
     * 获取对标枚举
     * @return
     */
    DefEnumItf getBenchmarking();

    /**
     * 获取精度
     * @return
     */
    int getAccuracy();

    /**
     * 获取定义基础信息
     * @return
     */
    DefInfo getDefInfo();

}
