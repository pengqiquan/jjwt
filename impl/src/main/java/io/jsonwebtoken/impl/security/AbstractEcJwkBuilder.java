package io.jsonwebtoken.impl.security;

import io.jsonwebtoken.security.CurveId;
import io.jsonwebtoken.security.EcJwk;
import io.jsonwebtoken.security.EcJwkBuilder;

@SuppressWarnings("unchecked")
abstract class AbstractEcJwkBuilder<K extends EcJwk<K>, T extends EcJwkBuilder<K, T>> extends AbstractJwkBuilder<K, T> implements EcJwkBuilder<K, T> {

    AbstractEcJwkBuilder(JwkValidator<K> validator) {
        super(validator);
    }

    @Override
    public T setCurveId(CurveId curveId) {
        this.jwk.setCurveId(curveId);
        return (T) this;
    }

    @Override
    public T setX(String x) {
        this.jwk.setX(x);
        return (T) this;
    }

    @Override
    public T setY(String y) {
        this.jwk.setY(y);
        return (T) this;
    }
}
