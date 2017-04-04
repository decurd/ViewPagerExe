package kr.co.roonets.viewpagerexe;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    private static final String TAG = SecondFragment.class.getSimpleName();
    TextView txt_receive;

    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.fragment_second, container, false);
        txt_receive = (TextView) layout.findViewById(R.id.txt_receive);
        return layout;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        if (isVisibleToUser) {                                  // 사용자에게 보이는 상태일 때
            txt_receive.setText(((MainActivity)getActivity()).tempCount+"");
            //Toast.makeText(getActivity(), ((MainActivity)getActivity()).tempCount+"", Toast.LENGTH_SHORT).show();
        } else {
            // Log.d(TAG, "setUserVisibleHint: invisible");
        }
        super.setUserVisibleHint(isVisibleToUser);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

}
