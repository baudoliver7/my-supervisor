package com.supervisor.copying.generating;

import java.io.IOException;
import java.util.Map;

import com.supervisor.copying.AbstractDataSheetModelWriter;
import com.supervisor.domain.Activity;
import com.supervisor.domain.DataModel;
import com.supervisor.domain.DataSheetModel;

public final class DataSheetModelGenerating extends AbstractDataSheetModelWriter {

	public DataSheetModelGenerating(Activity targetActivity, DataSheetModel source, Map<Long, DataModel> dataModelMappings) {
		super(targetActivity, source, dataModelMappings);
	}
	
	public DataSheetModelGenerating(final DataSheetModel source, final DataSheetModel target, final Map<Long, DataModel> dataModelMappings) throws IOException {
		super(source, target, dataModelMappings);
	}	
}
