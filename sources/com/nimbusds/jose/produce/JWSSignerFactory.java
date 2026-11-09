package com.nimbusds.jose.produce;

import P5.k;
import T5.d;
import com.nimbusds.jose.JWSProvider;
import com.nimbusds.jose.JWSSigner;

/* JADX INFO: loaded from: classes3.dex */
public interface JWSSignerFactory extends JWSProvider {
    JWSSigner createJWSSigner(d dVar) throws P5.d;

    JWSSigner createJWSSigner(d dVar, k kVar) throws P5.d;
}
