package com.pupilary.openfeign.rule;

import java.util.List;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.RoundRobinRule;
import com.netflix.loadbalancer.Server;

import cn.hutool.core.util.RandomUtil;

/**
 * 自定义隔离随机规则
 * 
 * @author takesi
 *
 */
public class IsolationRule extends RoundRobinRule {

	private final static String KEY_DEFAULT = "default";

	@Override
	public Server choose(ILoadBalancer lb, Object key) {
		return super.choose(lb, key);
	}

	/**
	 * 随机取一个实例
	 */
	private Server getServer(List<Server> upList) {
		int nextInt = RandomUtil.randomInt(upList.size());
		return upList.get(nextInt);
	}

}
