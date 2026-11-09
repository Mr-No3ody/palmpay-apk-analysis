package Zc;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import com.reactnativecommunity.clipboard.ClipboardModule;
import com.transsnet.palmpay.photograph.PhotoPickerActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PhotoPickerActivity f11625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f11626b;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        int iLastIndexOf;
        ArrayList arrayList = new ArrayList();
        b bVar = new b("All");
        arrayList.add(bVar);
        HashMap map = new HashMap();
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.f11626b.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_data", "_id"}, "mime_type= ? or mime_type= ? or mime_type= ?", new String[]{"image/jpeg", "image/png", ClipboardModule.MIMETYPE_JPG}, "date_added DESC");
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex("_data");
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
                boolean z3 = true;
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndex);
                    Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, cursorQuery.getLong(columnIndexOrThrow));
                    if (!TextUtils.isEmpty(string)) {
                        File file = new File(string);
                        if (file.exists() && file.length() != 0) {
                            if (z3) {
                                bVar.f11616b = string;
                                z3 = false;
                            }
                            ArrayList arrayList2 = bVar.f11617c;
                            if (arrayList2 != null) {
                                arrayList2.add(uriWithAppendedId);
                            }
                            File parentFile = new File(string).getParentFile();
                            String absolutePath = parentFile != null ? parentFile.getAbsolutePath() : "";
                            if (TextUtils.isEmpty(absolutePath) && (iLastIndexOf = string.lastIndexOf(File.separator)) != -1) {
                                absolutePath = string.substring(0, iLastIndexOf);
                            }
                            if (!TextUtils.isEmpty(absolutePath)) {
                                if (map.containsKey(absolutePath)) {
                                    ArrayList arrayList3 = ((b) map.get(absolutePath)).f11617c;
                                    if (arrayList3 != null) {
                                        arrayList3.add(uriWithAppendedId);
                                    }
                                } else {
                                    String strSubstring = absolutePath.substring(absolutePath.lastIndexOf(File.separator) + 1);
                                    if (TextUtils.isEmpty(strSubstring)) {
                                        strSubstring = "/";
                                    }
                                    b bVar2 = new b(strSubstring);
                                    bVar2.f11616b = string;
                                    ArrayList arrayList4 = bVar2.f11617c;
                                    if (arrayList4 != null) {
                                        arrayList4.add(uriWithAppendedId);
                                    }
                                    map.put(absolutePath, bVar2);
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(map.values());
            if (cursorQuery != null) {
                return arrayList;
            }
        } catch (Exception e10) {
            Log.e("PhotoLoadTask", e10.getMessage());
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        super.onCancelled();
        PhotoPickerActivity photoPickerActivity = this.f11625a;
        if (photoPickerActivity != null) {
            photoPickerActivity.onTaskCancelled();
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        ArrayList<b> arrayList = (ArrayList) obj;
        super.onPostExecute(arrayList);
        PhotoPickerActivity photoPickerActivity = this.f11625a;
        if (photoPickerActivity != null) {
            photoPickerActivity.onPostExecute(arrayList);
        }
    }

    @Override // android.os.AsyncTask
    public final void onProgressUpdate(Object[] objArr) {
        ArrayList<b>[] arrayListArr = (ArrayList[]) objArr;
        super.onProgressUpdate(arrayListArr);
        PhotoPickerActivity photoPickerActivity = this.f11625a;
        if (photoPickerActivity != null) {
            photoPickerActivity.onProgressUpdate(arrayListArr[0]);
        }
    }
}
