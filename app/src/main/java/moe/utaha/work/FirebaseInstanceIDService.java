package moe.utaha.work;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by chojeaho on 2016-10-29.
 */
public class FirebaseInstanceIDService extends FirebaseInstanceIdService{
    private static final String TAG = "FirebaseInstanceIDService";

    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);
    }
}
