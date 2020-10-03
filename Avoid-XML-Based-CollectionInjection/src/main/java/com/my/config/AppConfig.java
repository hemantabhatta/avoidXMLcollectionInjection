package com.my.config;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.my.beans.Product;

@Configuration
public class AppConfig {
	@Bean("pinfo")
	public Product prodObj() {
		Product p = new Product();
		p.setData(list());
		p.setModels(set());
		p.setModes(map());
		p.setContext(prop());
		return p;
	}

	public List<String> list() {
		List<String> l = new LinkedList<String>();
		l.add("p1");
		l.add("P2");
		l.add("P3");
		return l;
	}

	public Set<String> set() {
		Set<String> s = new LinkedHashSet<String>();
		s.add("S1");
		s.add("S2");
		s.add("S3");
		return s;
	}

	public Map<Integer, String> map() {
		Map<Integer, String> m = new LinkedHashMap<Integer, String>();
		m.put(10, "A");
		m.put(20, "B");
		m.put(30, "C");
		return m;
	}

	public Properties prop() {
		Properties p = new Properties();
		p.put("A1", "B1");
		p.put("A2", "B2");
		p.put("A3", "B3");

		return p;
	}
}
