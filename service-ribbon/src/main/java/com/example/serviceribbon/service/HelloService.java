package com.example.serviceribbon.service;

/**
 * @author 祁宏钢
 * @date 2018/6/19
 */
public interface HelloService {
    /**
     * 提供service-hi的负债均衡服务
     * @param name
     * @return 服务内容
     */
    String hiService(String name);
    String hiError(String name);

}
