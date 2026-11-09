package com.nimbusds.jwt;

import P5.c;
import java.io.Serializable;
import java.text.ParseException;
import p022b6.b;

/* JADX INFO: loaded from: classes3.dex */
public interface JWT extends Serializable {
    c getHeader();

    b getJWTClaimsSet() throws ParseException;

    Z5.b[] getParsedParts();

    String getParsedString();

    String serialize();
}
