package com.ubi.dbp.proxy.cbs.user.service.apl;

import com.ubi.dbp.proxy.cbs.user.service.model.customer.AIFRequest;
import com.ubi.dbp.proxy.cbs.user.service.model.customer.AIFResponse;

public interface AifCreateService {
	AIFResponse createAif(AIFRequest accCreateRequest);
}
