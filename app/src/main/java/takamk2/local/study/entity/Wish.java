package takamk2.local.study.entity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;

import java.io.InputStream;
import java.util.Calendar;

import takamk2.local.study.R;

/**
 * Created by takamk2 on 16/12/03.
 * <p/>
 * The Edit Fragment of Base Class.
 */
// Todo: add parcelable
public final class Wish extends Entity {

    public static final Float MIN_REVIEW_RATE = 1F;

    public static final Float MAX_REVIEW_RATE = 5F;

    /**
     * 名前
     */
    private String mName = null;

    /** 金額 */
    private Long mPrice = null;

    /** 詳細 */
    private String mDescription = null;

    /** 画像 */
    private Drawable mPicture = null;

    /** サイトのURI */
    private String mSiteUrl = null;

    /** 購入済みフラグ */
    private boolean mIsPurchased = false;

    /** 購入理由 */ // Todo: 購入時に入力する(Dialog)
    private String mPurchasedReason = null;

    /** 評価レート null,1-5 */  // Todo: 購入後に入力できる(評価ボタン)
    private Float mReviewRate = 0F;

    /** 評価 */ // Todo: 購入後に入力できる(評価ボタン)
    private String mReview = null;

    /** 登録日 */
    private Long mCreated = null;

    /** 購入日 */ // Todo: 購入後に表示する
    private Long mPurchasedDate = null;

    public Wish() {
    }

    public static Wish getDummyData(Context context) {
        Calendar createdCal = Calendar.getInstance();
        createdCal.set(2016, 11, 30, 10, 53);
        long now = System.currentTimeMillis();

        InputStream is = context.getResources().openRawResource(R.raw.psvr2);
        Bitmap pictureBitmap = BitmapFactory.decodeStream(is);

        String name = "PSVR";
        Long price = 44980L;
        String description = "PSVRは次世代のゲームです。今はまだコンテンツが充実していないが、ハマれば出かける必要が無くなるかもしれません。";
        Drawable picture = new BitmapDrawable(context.getResources(), pictureBitmap); // Todo: http://stackoverflow.com/questions/23606202/how-to-save-captured-photo-in-application-directory-in-android
        String siteUrl = "http://www.jp.playstation.com/psvr/";
        boolean isPurchased = true;
        String purchasedReason = "乗るしかなかった、このBigWaveに！";
        Float reviewRate = 4F;
        String review = "思ったよりも気持ち悪かなったが、没入感が半端無かった";
        Long created = createdCal.getTimeInMillis();
        Long purchasedDate = now;

        Wish dummy = new Wish();
        dummy.setName(name);
        dummy.setPrice(price);
        dummy.setDescription(description);
        dummy.setPicture(picture);
        dummy.setSiteUrl(siteUrl);
        dummy.setIsPurchased(isPurchased);
        dummy.setPurchasedReason(purchasedReason);
        dummy.setReviewRate(reviewRate);
        dummy.setReview(review);
        dummy.setCreated(created);
        dummy.setPurchasedDate(purchasedDate);
        return dummy;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setPrice(Long price) {
        mPrice = price;
    }

    public Long getPrice() {
        return mPrice;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setPicture(String picturePath) {
        mPicture = null; // Todo:
    }

    public void setPicture(Uri pictureUri) {
        mPicture = null; // Todo
    }

    public void setPicture(Drawable picture) {
        mPicture = picture; // Todo
    }

    public Drawable getPicture() {
        return mPicture;
    }

    public void setSiteUrl(String siteUrl) {
        mSiteUrl = siteUrl;
    }

    public String getSiteUrl() {
        return mSiteUrl; // Todo: checkSideUri(String siteUrl)
    }

    public void setIsPurchased(boolean isPurchased) {
        mIsPurchased = isPurchased;
    }

    public boolean IsPurchased() {
        return mIsPurchased;
    }

    public void setPurchasedReason(String purchasedReason) {
        mPurchasedReason = purchasedReason;
    }

    public String getPurchasedReason() {
        return mPurchasedReason;
    }

    public void setReviewRate(Float reviewRate) {
        mReviewRate = reviewRate;
        if (reviewRate != null) {
            if (reviewRate < MIN_REVIEW_RATE) {
                mReviewRate = MIN_REVIEW_RATE;
            } else if (reviewRate > MAX_REVIEW_RATE) {
                mReviewRate = MAX_REVIEW_RATE;
            }
        }
    }

    public Float getReviewRate() {
        return mReviewRate;
    }

    public void setReview(String review) {
        mReview = review;
    }

    public String getReview() {
        return mReview;
    }

    public void setCreated(Long created) {
        mCreated = created;
    }

    public Long getCreated() {
        return mCreated;
    }

    public void setPurchasedDate(Long purchasedDate) {
        mPurchasedDate = purchasedDate;
    }

    public Long getPurchasedDate() {
        return mPurchasedDate;
    }
}
