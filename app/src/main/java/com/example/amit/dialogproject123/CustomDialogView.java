package com.example.amit.dialogproject123;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Amit on 6/20/2017.
 */

public class CustomDialogView extends DialogFragment {
    LayoutInflater inflater;
    View view;
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        inflater=(LayoutInflater)getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(R.layout.customview,null);
        final AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());
        builder.setView(view).setNegativeButton("NO                                              ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
               builder.getContext();
            }
        }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(),"Deleted",Toast.LENGTH_SHORT).show();
            }
        });
        return builder.create();
    }
}
