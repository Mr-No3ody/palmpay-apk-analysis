package com.palmpay.lib.bridge;

import android.app.Activity;
import androidx.annotation.WorkerThread;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.palmpay.lib.bridge.entry.BridgeResult;
import com.palmpay.lib.bridge.param.BridgeRequestParam;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    @WorkerThread
    public final void b2n(@Nullable Activity activity, @NotNull String params, @NotNull IBridgeCallback callback) {
        Unit unit;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            GsonBuilder gsonBuilder = new GsonBuilder();
            final Gson gson = new Gson();
            Gson gsonCreate = gsonBuilder.registerTypeAdapterFactory(new TypeAdapterFactory(gson) { // from class: com.palmpay.lib.bridge.BridgeWrapper$GsonFactory

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Gson f23803a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final BridgeWrapper$GsonAdapter f23804b;

                /* JADX WARN: Type inference failed for: r0v1, types: [com.palmpay.lib.bridge.BridgeWrapper$GsonAdapter] */
                {
                    Intrinsics.checkNotNullParameter(gson, "originGson");
                    this.f23803a = gson;
                    this.f23804b = new JsonDeserializer<Object>(gson) { // from class: com.palmpay.lib.bridge.BridgeWrapper$GsonAdapter

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final Gson f23802a;

                        {
                            Intrinsics.checkNotNullParameter(gson, "gson");
                            this.f23802a = gson;
                        }

                        public static void a(JsonArray jsonArray) {
                            LinkedList linkedList = new LinkedList();
                            int i7 = 0;
                            for (JsonElement jsonElement : jsonArray) {
                                int i10 = i7 + 1;
                                if (i7 < 0) {
                                    C1850q.k();
                                    throw null;
                                }
                                JsonElement jsonElement2 = jsonElement;
                                if (jsonElement2.isJsonNull()) {
                                    linkedList.addFirst(Integer.valueOf(i7));
                                } else if (jsonElement2.isJsonObject()) {
                                    JsonObject asJsonObject = jsonElement2.getAsJsonObject();
                                    Intrinsics.checkNotNullExpressionValue(asJsonObject, "jsonElement.asJsonObject");
                                    b(asJsonObject);
                                } else if (jsonElement2.isJsonArray()) {
                                    JsonArray asJsonArray = jsonElement2.getAsJsonArray();
                                    Intrinsics.checkNotNullExpressionValue(asJsonArray, "jsonElement.asJsonArray");
                                    a(asJsonArray);
                                }
                                i7 = i10;
                            }
                            Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                jsonArray.remove(((Number) it.next()).intValue());
                            }
                        }

                        public static void b(JsonObject jsonObject) {
                            ArrayList arrayList = new ArrayList();
                            Set<String> setKeySet = jsonObject.keySet();
                            Intrinsics.checkNotNullExpressionValue(setKeySet, "obj.keySet()");
                            for (String str : setKeySet) {
                                JsonElement jsonElement = jsonObject.get(str);
                                if (jsonElement.isJsonNull()) {
                                    arrayList.add(str);
                                } else if (jsonElement.isJsonObject()) {
                                    JsonObject asJsonObject = jsonElement.getAsJsonObject();
                                    Intrinsics.checkNotNullExpressionValue(asJsonObject, "element.asJsonObject");
                                    b(asJsonObject);
                                } else if (jsonElement.isJsonArray()) {
                                    JsonArray asJsonArray = jsonElement.getAsJsonArray();
                                    Intrinsics.checkNotNullExpressionValue(asJsonArray, "element.asJsonArray");
                                    a(asJsonArray);
                                }
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                jsonObject.remove((String) it.next());
                            }
                        }

                        @Override // com.google.gson.JsonDeserializer
                        public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
                            Gson gson2 = this.f23802a;
                            if (jsonElement != null && jsonElement.isJsonObject()) {
                                JsonObject obj = jsonElement.getAsJsonObject();
                                Intrinsics.checkNotNullExpressionValue(obj, "obj");
                                b(obj);
                                Object objFromJson = gson2.fromJson(obj, type);
                                Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(obj, typeOfT)");
                                return objFromJson;
                            }
                            if (jsonElement == null || !jsonElement.isJsonArray()) {
                                Object objFromJson2 = gson2.fromJson(jsonElement, type);
                                Intrinsics.checkNotNullExpressionValue(objFromJson2, "gson.fromJson(json, typeOfT)");
                                return objFromJson2;
                            }
                            JsonArray array = jsonElement.getAsJsonArray();
                            Intrinsics.checkNotNullExpressionValue(array, "array");
                            a(array);
                            Object objFromJson3 = gson2.fromJson(array, type);
                            Intrinsics.checkNotNullExpressionValue(objFromJson3, "gson.fromJson(array, typeOfT)");
                            return objFromJson3;
                        }
                    };
                }

                @Override // com.google.gson.TypeAdapterFactory
                public final TypeAdapter create(Gson gson2, TypeToken typeToken) {
                    return TreeTypeAdapter.newFactoryWithMatchRawType(typeToken, this.f23804b).create(this.f23803a, typeToken);
                }
            }).create();
            BridgeRequestParam bridgeRequestParam = (BridgeRequestParam) gsonCreate.fromJson(params, BridgeRequestParam.class);
            IBridge iBridgeBindBridge = bindBridge(IBridge.class, bridgeRequestParam.path());
            if (iBridgeBindBridge != null) {
                iBridgeBindBridge.start(activity, bridgeRequestParam, callback);
                iBridgeBindBridge.execute(gsonCreate);
                unit = Unit.f38893a;
            } else {
                unit = null;
            }
            if (unit == null) {
                String json = new Gson().toJson(BridgeResult.Companion.notSupportResult$default(BridgeResult.INSTANCE, null, 1, null));
                Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(BridgeResult.notSupportResult())");
                callback.resolved(json);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public abstract IBridge bindBridge(Class cls, String str);
}
