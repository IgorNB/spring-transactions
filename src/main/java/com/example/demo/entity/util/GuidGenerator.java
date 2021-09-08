package com.example.demo.entity.util;

import java.util.UUID;
import org.hibernate.Session;
import org.hibernate.tuple.ValueGenerator;

public class GuidGenerator implements ValueGenerator<String> {

	@Override
	public String generateValue(final Session session, final Object owner) {
		return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
	}

}
