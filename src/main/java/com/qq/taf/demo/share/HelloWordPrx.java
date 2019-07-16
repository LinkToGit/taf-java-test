package com.qq.taf.demo.share;

import com.qq.cloud.taf.common.annotation.*;
import com.qq.cloud.taf.common.support.Holder;

/**
 * Generated code, DO NOT modify it!
 * @author jce2java
 */
@JceService
public interface HelloWordPrx {

	public String sayHello();

	public String sayHello(@JceContext java.util.Map<String, String> ctx);

	public void async_sayHello(@JceCallback HelloWordPrxCallback callback);

	public void async_sayHello(@JceCallback HelloWordPrxCallback callback, @JceContext java.util.Map<String, String> ctx);
}
