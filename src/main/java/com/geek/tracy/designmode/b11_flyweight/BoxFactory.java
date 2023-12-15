package com.geek.tracy.designmode.b11_flyweight;

import javax.swing.Box;
import java.util.HashMap;

/**
 * 方块工程类
 *
 * @author Tracy
 * @date 2023/12/15
 */
public class BoxFactory {

    // 保存共享的享元方块对象
    private static HashMap<String, AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("T", new TBox());
    }

    public static final BoxFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final BoxFactory INSTANCE = new BoxFactory();
    }

    /**
     * 根据形状获取方块
     * @param type 类型
     * @return
     */
    public AbstractBox getBox(String type) {
        return map.get(type);
    }

}
