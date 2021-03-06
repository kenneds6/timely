package timely.subscription;

import io.netty.util.AttributeKey;

import java.util.concurrent.ConcurrentHashMap;

public class SubscriptionRegistry extends ConcurrentHashMap<String, Subscription> {

    public static final AttributeKey<String> SESSION_ID_ATTR = AttributeKey.newInstance("sessionId");
    public static final AttributeKey<String> SUBSCRIPTION_ID_ATTR = AttributeKey.newInstance("subscriptionId");

    private static final long serialVersionUID = 1L;
    private static final SubscriptionRegistry REGISTRY = new SubscriptionRegistry();

    private SubscriptionRegistry() {
    }

    public static SubscriptionRegistry get() {
        return REGISTRY;
    }

}
