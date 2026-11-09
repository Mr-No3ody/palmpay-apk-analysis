package com.smallnew.smartassets;

import android.util.Log;
import androidx.multidex.c;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.MapBuilder;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class RNSmartassetsModule extends ReactContextBaseJavaModule {
    static final Map<String, Object> CONSTANTS = MapBuilder.of("hello", "kitty");
    private final ReactApplicationContext reactContext;

    public RNSmartassetsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return CONSTANTS;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Smartassets";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isFileExist(String str) {
        Log.e("Smartassets", "filePath ====> " + str);
        if (str == null) {
            return false;
        }
        return new File(str.replace("file://", "")).exists();
    }

    @ReactMethod
    public void travelDrawable(String str, Callback callback) {
        File[] fileArrListFiles;
        Log.e("Smartassets", "bundlePath ===> " + str);
        WritableArray writableArrayCreateArray = Arguments.createArray();
        File parentFile = new File(str).getParentFile();
        if (!parentFile.isDirectory() || (fileArrListFiles = parentFile.listFiles(new c(1))) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            String absolutePath = file.getAbsolutePath();
            for (String str2 : file.list()) {
                StringBuilder sb2 = new StringBuilder("drawable ===> file://");
                sb2.append(absolutePath);
                String str3 = File.separator;
                sb2.append(str3);
                sb2.append(str2);
                Log.e("Smartassets", sb2.toString());
                writableArrayCreateArray.pushString("file://" + absolutePath + str3 + str2);
            }
        }
        callback.invoke(writableArrayCreateArray);
    }
}
