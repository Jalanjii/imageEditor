package com.example.ImageEditor;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public class BitmapResizer {
    /**
     * This method takes bitmap and resize it with width and height
     *
     * @param bm        input bitmap
     * @param newWidth  new width value
     * @param newHeight new height value
     * @return resized bitmap
     */
    public static Bitmap getResizedBitmap(Bitmap bm, int newWidth, int newHeight) {
        int width = bm.getWidth();
        int height = bm.getHeight();
        float scaleWidth = ((float) newWidth) / width;
        float scaleHeight = ((float) newHeight) / height;
        // CREATE A MATRIX FOR THE MANIPULATION
        Matrix matrix = new Matrix();
        // RESIZE THE BIT MAP
        matrix.postScale(scaleWidth, scaleHeight);

        // "RECREATE" THE NEW BITMAP
        Bitmap resizedBitmap = Bitmap.createBitmap(
                bm, 0, 0, width, height, matrix, false);
        //bm.recycle(); freeing up bitmap for memory
        return resizedBitmap;
    }
}
