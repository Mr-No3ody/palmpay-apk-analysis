package com.microsoft.codepush.react;

import N8.q0;
import android.util.Log;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class CodePushUtils {

    /* JADX INFO: renamed from: com.microsoft.codepush.react.CodePushUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Map.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Boolean.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Null.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static String appendPathComponent(String str, String str2) {
        return new File(str, str2).getAbsolutePath();
    }

    public static WritableArray convertJsonArrayToWritable(JSONArray jSONArray) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            try {
                Object obj = jSONArray.get(i7);
                if (obj instanceof JSONObject) {
                    writableArrayCreateArray.pushMap(convertJsonObjectToWritable((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    writableArrayCreateArray.pushArray(convertJsonArrayToWritable((JSONArray) obj));
                } else if (obj instanceof String) {
                    writableArrayCreateArray.pushString((String) obj);
                } else if (obj instanceof Double) {
                    writableArrayCreateArray.pushDouble(((Double) obj).doubleValue());
                } else if (obj instanceof Integer) {
                    writableArrayCreateArray.pushInt(((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    writableArrayCreateArray.pushBoolean(((Boolean) obj).booleanValue());
                } else {
                    if (obj != null) {
                        throw new CodePushUnknownException("Unrecognized object: " + obj);
                    }
                    writableArrayCreateArray.pushNull();
                }
            } catch (JSONException e10) {
                throw new CodePushUnknownException(i7 + " should be within bounds of array " + jSONArray.toString(), e10);
            }
        }
        return writableArrayCreateArray;
    }

    public static WritableMap convertJsonObjectToWritable(JSONObject jSONObject) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = !jSONObject.isNull(next) ? jSONObject.get(next) : null;
                if (obj instanceof JSONObject) {
                    writableMapCreateMap.putMap(next, convertJsonObjectToWritable((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    writableMapCreateMap.putArray(next, convertJsonArrayToWritable((JSONArray) obj));
                } else if (obj instanceof String) {
                    writableMapCreateMap.putString(next, (String) obj);
                } else if (obj instanceof Double) {
                    writableMapCreateMap.putDouble(next, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    writableMapCreateMap.putDouble(next, ((Long) obj).doubleValue());
                } else if (obj instanceof Integer) {
                    writableMapCreateMap.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    writableMapCreateMap.putBoolean(next, ((Boolean) obj).booleanValue());
                } else {
                    if (obj != null) {
                        throw new CodePushUnknownException("Unrecognized object: " + obj);
                    }
                    writableMapCreateMap.putNull(next);
                }
            } catch (JSONException e10) {
                StringBuilder sbQ = q0.q("Key ", next, " should exist in ");
                sbQ.append(jSONObject.toString());
                sbQ.append(Consts.DOT);
                throw new CodePushUnknownException(sbQ.toString(), e10);
            }
        }
        return writableMapCreateMap;
    }

    public static JSONArray convertReadableToJsonArray(ReadableArray readableArray) {
        JSONArray jSONArray = new JSONArray();
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i7).ordinal()]) {
                case 1:
                    jSONArray.put(convertReadableToJsonObject(readableArray.getMap(i7)));
                    break;
                case 2:
                    jSONArray.put(convertReadableToJsonArray(readableArray.getArray(i7)));
                    break;
                case 3:
                    jSONArray.put(readableArray.getString(i7));
                    break;
                case 4:
                    double d2 = readableArray.getDouble(i7);
                    Double dValueOf = Double.valueOf(d2);
                    if (d2 == Math.floor(d2) && !Double.isInfinite(d2)) {
                        jSONArray.put(dValueOf.longValue());
                    } else {
                        try {
                            jSONArray.put(d2);
                        } catch (JSONException unused) {
                            throw new CodePushUnknownException("Unable to put value " + readableArray.getDouble(i7) + " in JSONArray");
                        }
                    }
                    break;
                case 5:
                    jSONArray.put(readableArray.getBoolean(i7));
                    break;
                case 6:
                    jSONArray.put((Object) null);
                    break;
            }
        }
        return jSONArray;
    }

    public static JSONObject convertReadableToJsonObject(ReadableMap readableMap) {
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            ReadableType type = readableMap.getType(strNextKey);
            try {
                switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[type.ordinal()]) {
                    case 1:
                        jSONObject.put(strNextKey, convertReadableToJsonObject(readableMap.getMap(strNextKey)));
                        continue;
                    case 2:
                        jSONObject.put(strNextKey, convertReadableToJsonArray(readableMap.getArray(strNextKey)));
                        continue;
                    case 3:
                        jSONObject.put(strNextKey, readableMap.getString(strNextKey));
                        continue;
                    case 4:
                        jSONObject.put(strNextKey, readableMap.getDouble(strNextKey));
                        continue;
                    case 5:
                        jSONObject.put(strNextKey, readableMap.getBoolean(strNextKey));
                        continue;
                    case 6:
                        jSONObject.put(strNextKey, (Object) null);
                        continue;
                    default:
                        throw new CodePushUnknownException("Unrecognized type: " + type + " of key: " + strNextKey);
                }
            } catch (JSONException e10) {
                throw new CodePushUnknownException(q0.k("Error setting key: ", strNextKey, " in JSONObject"), e10);
            }
            throw new CodePushUnknownException(q0.k("Error setting key: ", strNextKey, " in JSONObject"), e10);
        }
        return jSONObject;
    }

    public static JSONObject getJsonObjectFromFile(String str) throws IOException {
        try {
            return new JSONObject(FileUtils.readFileToString(str));
        } catch (JSONException e10) {
            throw new CodePushMalformedDataException(str, e10);
        }
    }

    public static String getStringFromInputStream(InputStream inputStream) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            StringBuilder sb2 = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                    sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    if (inputStream == null) {
                        throw th;
                    }
                    inputStream.close();
                    throw th;
                }
            }
            String strTrim = sb2.toString().trim();
            bufferedReader.close();
            if (inputStream != null) {
                inputStream.close();
            }
            return strTrim;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    public static void log(String str) {
    }

    public static void logBundleUrl(String str) {
        log("Loading JS bundle from \"" + str + "\"");
    }

    public static void setJSONValueForKey(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
            throw new CodePushUnknownException("Unable to set value " + obj + " for key " + str + " to JSONObject");
        }
    }

    public static String tryGetString(ReadableMap readableMap, String str) {
        try {
            return readableMap.getString(str);
        } catch (NoSuchKeyException unused) {
            return null;
        }
    }

    public static void writeJsonToFile(JSONObject jSONObject, String str) throws Throwable {
        FileUtils.writeStringToFile(jSONObject.toString(), str);
    }

    public static void log(Throwable th) {
        Log.e("ReactNative", "[CodePush] Exception", th);
    }
}
