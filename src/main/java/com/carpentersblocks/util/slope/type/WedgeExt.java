package com.carpentersblocks.util.slope.type;

import com.carpentersblocks.data.Slope;
import com.carpentersblocks.util.slope.SlopeType;

public class WedgeExt implements SlopeType {

	@Override
	public Slope onHammerLeftClick(Slope slope) {
	    int slopeID = slope.slopeID;
		if (slope.isPositive) {
            if (++slopeID > Slope.ID_WEDGE_EXT_POS_SW) {
                slopeID = Slope.ID_WEDGE_EXT_POS_SE;
            }
        } else {
            if (++slopeID > Slope.ID_WEDGE_EXT_NEG_SW) {
                slopeID = Slope.ID_WEDGE_EXT_NEG_SE;
            }
        }
		return Slope.getSlopeById(slopeID);
	}

	@Override
	public Slope onHammerRightClick(Slope slope) {
	    int slopeID = slope.slopeID;
		if (slope.isPositive) {
            slopeID -= 4;
        } else {
            slopeID += 12;
        }
		return Slope.getSlopeById(slopeID);
	}

}