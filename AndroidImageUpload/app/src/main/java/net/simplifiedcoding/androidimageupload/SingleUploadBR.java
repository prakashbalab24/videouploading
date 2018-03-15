package net.simplifiedcoding.androidimageupload;

import net.gotev.uploadservice.UploadServiceBroadcastReceiver;

/**
 * Created by batman on 12/03/18.
 * MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
 * MM.:  .:'   `:::  .:`MMMMMMMMMMM|`MMM'|MMMMMMMMMMM':  .:'   `:::  .:'.MM
 * MMMM.     :          `MMMMMMMMMM  :*'  MMMMMMMMMM'        :        .MMMM
 * MMMMM.    ::    .     `MMMMMMMM'  ::   `MMMMMMMM'   .     ::   .  .MMMMM
 * MMMMMMM    ;::         ;::         ;::         ;::         ;::   MMMMMMM
 * MMMMMMM .:'   `:::  .:'   `:::  .:'   `:::  .:'   `:::  .:'   `::MMMMMMM
 * MMMMM'______::____      ::    .     ::    .     ::     ___._::____`MMMMM
 * MMMMMMMMMMMMMMMMMMM`---._ :: ::'  :   :: ::'  _.--::MMMMMMMMMMMMMMMMMMMM
 * MMMMMMMMMMMMMMMMMMMMMMMMMM::.         ::  .--MMMMMMMMMMMMMMMMMMMMMMMMMMM
 * MMMMMMMMMMMMMMMMMMMMMMMMMMMMMM-.     ;::-MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
 * MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM. .:' .M:F_P:MMMMMMMMMMMMMMMMMMMMMMMMMMM
 * MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM.   .MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
 * MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\ /MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
 * MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMVMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
 */

public class SingleUploadBR extends UploadServiceBroadcastReceiver {

    public interface Delegate {
        void onProgress(int progress);
        void onProgress(long uploadedBytes, long totalBytes);
        void onError(Exception exception);
        void onCompleted(int serverResponseCode, byte[] serverResponseBody);
        void onCancelled();
    }

    private String mUploadID;
    private Delegate mDelegate;

    public void setUploadID(String uploadID) {
        mUploadID = uploadID;
    }

    public void setDelegate(Delegate delegate) {
        mDelegate = delegate;
    }

//    @Override
//    public void onProgress(String uploadId, int progress) {
//        if (uploadId.equals(mUploadID) && mDelegate != null) {
//            mDelegate.onProgress(progress);
//        }
//    }
//
//    @Override
//    public void onProgress(String uploadId, long uploadedBytes, long totalBytes) {
//        if (uploadId.equals(mUploadID) && mDelegate != null) {
//            mDelegate.onProgress(uploadedBytes, totalBytes);
//        }
//    }
//
//    @Override
//    public void onError(String uploadId, Exception exception) {
//        if (uploadId.equals(mUploadID) && mDelegate != null) {
//            mDelegate.onError(exception);
//        }
//    }
//
//    @Override
//    public void onCompleted(String uploadId, int serverResponseCode, byte[] serverResponseBody) {
//        if (uploadId.equals(mUploadID) && mDelegate != null) {
//            mDelegate.onCompleted(serverResponseCode, serverResponseBody);
//        }
//    }
//
//    @Override
//    public void onCancelled(String uploadId) {
//        if (uploadId.equals(mUploadID) && mDelegate != null) {
//            mDelegate.onCancelled();
//        }
//    }
}