package p022b6;

import P5.n;
import Z5.b;
import Z5.c;
import com.alibaba.android.arouter.utils.Consts;
import com.nimbusds.jwt.JWT;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends n implements JWT {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f18787g;

    public static d b(String str) throws ParseException {
        b[] bVarArr;
        String strTrim = str.trim();
        int iIndexOf = strTrim.indexOf(Consts.DOT);
        if (iIndexOf == -1) {
            throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing part delimiters", 0);
        }
        int i7 = iIndexOf + 1;
        int iIndexOf2 = strTrim.indexOf(Consts.DOT, i7);
        if (iIndexOf2 == -1) {
            throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing second delimiter", 0);
        }
        int i10 = iIndexOf2 + 1;
        int iIndexOf3 = strTrim.indexOf(Consts.DOT, i10);
        if (iIndexOf3 == -1) {
            bVarArr = new b[]{new b(strTrim.substring(0, iIndexOf)), new b(strTrim.substring(i7, iIndexOf2)), new b(strTrim.substring(i10))};
        } else {
            int i11 = iIndexOf3 + 1;
            int iIndexOf4 = strTrim.indexOf(Consts.DOT, i11);
            if (iIndexOf4 == -1) {
                throw new ParseException("Invalid serialized JWE object: Missing fourth delimiter", 0);
            }
            if (iIndexOf4 != -1 && strTrim.indexOf(Consts.DOT, iIndexOf4 + 1) != -1) {
                throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Too many part delimiters", 0);
            }
            bVarArr = new b[]{new b(strTrim.substring(0, iIndexOf)), new b(strTrim.substring(i7, iIndexOf2)), new b(strTrim.substring(i10, iIndexOf3)), new b(strTrim.substring(i11, iIndexOf4)), new b(strTrim.substring(iIndexOf4 + 1))};
        }
        if (bVarArr.length == 3) {
            return new d(bVarArr[0], bVarArr[1], bVarArr[2]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be three", 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    @Override // com.nimbusds.jwt.JWT
    public final b getJWTClaimsSet() throws ParseException {
        Map mapG;
        b bVar = this.f18787g;
        if (bVar != null) {
            return bVar;
        }
        String string = this.f6950a.toString();
        if (string == null) {
            mapG = null;
        } else {
            try {
                mapG = c.g(-1, string);
            } catch (ParseException unused) {
                mapG = null;
            }
        }
        if (mapG == null) {
            throw new ParseException("Payload of JWS object is not a valid JSON object", 0);
        }
        int i7 = b.f18785b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : mapG.keySet()) {
            str.getClass();
            switch (str) {
                case "aud":
                    Object obj = mapG.get("aud");
                    if (obj instanceof String) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add((String) c.b(mapG, "aud", String.class));
                        linkedHashMap.put("aud", arrayList);
                        break;
                    } else {
                        if (!(obj instanceof List)) {
                            if (obj != null) {
                                throw new ParseException("Unexpected type of aud claim", 0);
                            }
                            linkedHashMap.put("aud", null);
                        } else {
                            linkedHashMap.put("aud", c.e("aud", mapG));
                        }
                        break;
                    }
                    break;
                case "exp":
                    linkedHashMap.put("exp", new Date(c.c("exp", mapG) * 1000));
                    break;
                case "iat":
                    linkedHashMap.put("iat", new Date(c.c("iat", mapG) * 1000));
                    break;
                case "iss":
                    linkedHashMap.put("iss", (String) c.b(mapG, "iss", String.class));
                    break;
                case "jti":
                    linkedHashMap.put("jti", (String) c.b(mapG, "jti", String.class));
                    break;
                case "nbf":
                    linkedHashMap.put("nbf", new Date(c.c("nbf", mapG) * 1000));
                    break;
                case "sub":
                    Object obj2 = mapG.get("sub");
                    if (obj2 instanceof String) {
                        linkedHashMap.put("sub", (String) c.b(mapG, "sub", String.class));
                        break;
                    } else {
                        if (!(obj2 instanceof Number)) {
                            if (obj2 != null) {
                                throw new ParseException("Unexpected type of sub claim", 0);
                            }
                            linkedHashMap.put("sub", null);
                        } else {
                            linkedHashMap.put("sub", String.valueOf(obj2));
                        }
                        break;
                    }
                    break;
                default:
                    linkedHashMap.put(str, mapG.get(str));
                    break;
            }
        }
        b bVar2 = new b(linkedHashMap);
        this.f18787g = bVar2;
        return bVar2;
    }
}
