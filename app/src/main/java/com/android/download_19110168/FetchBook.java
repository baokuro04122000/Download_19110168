package com.android.download_19110168;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.ref.WeakReference;

public class FetchBook extends AsyncTaskLoader<String> {

    private String queryString;
    private String transferProtocol;
    private Context context;

    public FetchBook(String queryString, String transferProtocol, Context context) {
        super(context);
        this.queryString = queryString;
        this.transferProtocol = transferProtocol;
        this.context = context;
    }


    @Nullable
    @Override
    public String loadInBackground() {
        return null;
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }
}
