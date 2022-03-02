package com.travel.commonlib.hotel;



import com.travel.jumbo.model.hotel.CancellationPolicyDuplicate;

import java.util.ArrayList;

public class CancellationDuplicate {
    ArrayList<CancellationPolicyDuplicate> alCancelList;
    ArrayList<ExtraNoteDuplicate> alExtraNote;

    public ArrayList<CancellationPolicyDuplicate> getAlCancelList() {
        return alCancelList;
    }

    public void setAlCancelList(ArrayList<CancellationPolicyDuplicate> alCancelList) {
        this.alCancelList = alCancelList;
    }

    public ArrayList<ExtraNoteDuplicate> getAlExtraNote() {
        return alExtraNote;
    }

    public void setAlExtraNote(ArrayList<ExtraNoteDuplicate> alExtraNote) {
        this.alExtraNote = alExtraNote;
    }
}
