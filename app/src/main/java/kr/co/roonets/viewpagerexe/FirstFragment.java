package kr.co.roonets.viewpagerexe;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    private static final String TAG = FirstFragment.class.getSimpleName();
    EditText txt_number;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.fragment_first, container, false);

        Button btn_confirm = (Button) layout.findViewById(R.id.btn_confirm);
        txt_number = (EditText) layout.findViewById(R.id.txt_number);
        btn_confirm.setOnClickListener(new View.OnClickListener() {         // Fragment -> Fragment로 데이터를 전달하기 위한 로직
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).tempCount = Integer.parseInt(txt_number.getText().toString());
                ((MainActivity)getActivity()).vp.setCurrentItem(1);
            }
        });

        return layout;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
