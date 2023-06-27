package org.rncloudfs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;

public class RNCloudFsModule extends ReactContextBaseJavaModule {
    public static final String TAG = "RNCloudFs";

    private static final int REQUEST_CODE_RESOLUTION = 3;
    private static final int REQUEST_RESOLVE_ERROR = 1001;
    private static final String DIALOG_ERROR = "dialog_error";
    private boolean isResolvingError = false;

    private final ReactApplicationContext reactContext;

    public RNCloudFsModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    /**
     * android only method.  Just here to test the connection logic
     */
    @ReactMethod
    public void reset(final Promise promise) {
        promise.resolve(null);
    }

    @ReactMethod
    public void createFile(ReadableMap options, final Promise promise) {
        promise.reject("error", "targetPath not specified");
    }

    @ReactMethod
    public void fileExists(ReadableMap options, final Promise promise) {
        promise.reject("error", "targetPath not specified");
    }

    @ReactMethod
    public void listFiles(ReadableMap options, final Promise promise) {
        promise.reject("error", "targetPath not specified");
    }

    /**
     * Copy the source into the google drive database
     */
    @ReactMethod
    public void copyToCloud(ReadableMap options, final Promise promise) {
        promise.reject("error", "sourcePath not specified");
    }

    @Override
    public String getName() {
        return "RNCloudFs";
    }

}
