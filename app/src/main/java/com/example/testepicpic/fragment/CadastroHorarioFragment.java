package com.example.testepicpic.fragment;

import android.app.TimePickerDialog;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.testepicpic.R;
import com.example.testepicpic.activity.MainActivity;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CadastroHorarioFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CadastroHorarioFragment extends Fragment {
    ImageButton btnAddHoras, btnAddHoras1, btnAddHoras2, btnAddHoras3, btnAddHoras4;
    TextView txtGlicemia2, txtInsulina2, txtAgua2, txtMedicamento2;
    int Hour, min;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CadastroHorarioFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CadastroHorarioFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CadastroHorarioFragment newInstance(String param1, String param2) {
        CadastroHorarioFragment fragment = new CadastroHorarioFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_cadastro_horario, container, false);
        ;
        btnAddHoras = view.findViewById(R.id.btnAddHora);
        btnAddHoras1 = view.findViewById(R.id.btnAddHora1);
        btnAddHoras2 = view.findViewById(R.id.btnAddHora2);
        btnAddHoras3 = view.findViewById(R.id.btnAddHora3);
        btnAddHoras4 = view.findViewById(R.id.btnAddHora4);

        btnAddHoras.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Calendar c = Calendar.getInstance();
                Hour = c.get(Calendar.HOUR_OF_DAY);
                min = c.get(Calendar.MINUTE);

                TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                    }
                }, Hour, min,true);

                timePickerDialog.show();

            }
        });

        btnAddHoras1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                Hour = c.get(Calendar.HOUR_OF_DAY);
                min = c.get(Calendar.MINUTE);

                TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        txtGlicemia2 = view.findViewById(R.id.txtGlicemia2);
                        txtGlicemia2.setText(hourOfDay + ":"+minute);
                    }
                }, Hour, min,true);

                timePickerDialog.show();
            }
        });

        btnAddHoras2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                Hour = c.get(Calendar.HOUR_OF_DAY);
                min = c.get(Calendar.MINUTE);

                TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        txtInsulina2 = view.findViewById(R.id.txtInsulina2);
                        txtInsulina2.setText(hourOfDay + ":"+minute);
                    }
                }, Hour, min,true);

                timePickerDialog.show();
            }
        });

        btnAddHoras3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                Hour = c.get(Calendar.HOUR_OF_DAY);
                min = c.get(Calendar.MINUTE);

                TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        txtAgua2 = view.findViewById(R.id.txtAgua2);
                        txtAgua2.setText(hourOfDay + ":"+minute);
                    }
                }, Hour, min,true);

                timePickerDialog.show();
            }
        });

        btnAddHoras4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                Hour = c.get(Calendar.HOUR_OF_DAY);
                min = c.get(Calendar.MINUTE);

                TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        txtMedicamento2 = view.findViewById(R.id.txtMedicamento2);
                        txtMedicamento2.setText(hourOfDay + ":"+minute);
                    }
                }, Hour, min,true);

                timePickerDialog.show();
            }
        });
        return view;
    }
}