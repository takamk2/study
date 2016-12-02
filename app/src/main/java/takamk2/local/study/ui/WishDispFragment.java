package takamk2.local.study.ui;

import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import icepick.State;
import takamk2.local.study.R;
import takamk2.local.study.entity.Wish;

/**
 */
public class WishDispFragment extends BaseFragment {

    private Wish mData;

    private TextView mNameTv;
    private TextView mPriceTv;
    private TextView mDescriptionTv;
    private ImageView mPictureIv;
    private TextView mSiteUrlTv;
    private TextView mPurchasedReasonTv;
    private RatingBar mReviewRateRb;
    private TextView mReviewTv;
    private TextView mCreatedTv;
    private TextView mPurchasedDateTv;

    public WishDispFragment() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        // Todo: if will initialize, on this method.
    }

    public static WishDispFragment newInstance() {
        WishDispFragment fragment = new WishDispFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
        mData = Wish.getDummyData(getActivity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_wish_disp, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        bindViews(view);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mNameTv.setText(mData.getName());
        mPriceTv.setText(String.valueOf(mData.getPrice()));
        mDescriptionTv.setText(mData.getDescription());
        mPictureIv.setImageDrawable(mData.getPicture());
        mSiteUrlTv.setText(mData.getSiteUrl());
        mPurchasedReasonTv.setText(mData.getPurchasedReason());
        mReviewRateRb.setRating(mData.getReviewRate());
        mReviewTv.setText(mData.getReview());
        mCreatedTv.setText(String.valueOf(mData.getCreated())); // Todo: timestamp to date format
        mPurchasedDateTv.setText(String.valueOf(mData.getPurchasedDate()));
    }

    @Override
    public void onDetach() {
        super.onDetach();
        // if set listener in onAttched, set null in this method.
    }

    /**
     *
     * @param view
     */
    private void bindViews(View view) {
        mNameTv = (TextView) view.findViewById(R.id.name);
        mPriceTv = (TextView) view.findViewById(R.id.price);
        mDescriptionTv = (TextView) view.findViewById(R.id.description);
        mPictureIv = (ImageView) view.findViewById(R.id.picture);
        mSiteUrlTv = (TextView) view.findViewById(R.id.site_url);
        mPurchasedReasonTv = (TextView) view.findViewById(R.id.purchased_reason);
        mReviewRateRb = (RatingBar) view.findViewById(R.id.review_rate);
        mReviewTv = (TextView) view.findViewById(R.id.review);
        mCreatedTv = (TextView) view.findViewById(R.id.created);
        mPurchasedDateTv = (TextView) view.findViewById(R.id.purchased_date);
    }
}
