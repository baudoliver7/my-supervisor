package com.minlessika.supervisor.copying.templating;

import java.io.IOException;
import java.util.Map;

import com.minlessika.supervisor.copying.AbstractDataFieldOfSheetWriter;
import com.minlessika.supervisor.data.sharing.DataSheetSharing;
import com.minlessika.supervisor.data.sharing.DataSheetSharingImpl;
import com.minlessika.supervisor.domain.DataFieldOfSheet;
import com.minlessika.supervisor.domain.DataModel;
import com.minlessika.supervisor.domain.DataSheet;
import com.minlessika.supervisor.domain.DataSheetModel;
import com.minlessika.supervisor.domain.ListDataFieldOfSheet;
import com.minlessika.supervisor.domain.TableDataFieldOfSheet;
import com.minlessika.supervisor.domain.TableDataFieldOfSheetRow;
import com.minlessika.supervisor.domain.impl.PxTableDataFieldOfSheetRow;

public final class DataFieldOfSheetTemplating extends AbstractDataFieldOfSheetWriter {

	public DataFieldOfSheetTemplating(DataFieldOfSheet source, DataFieldOfSheet target, Map<Long, DataModel> dataModelMappings) throws IOException {
		super(source, target, dataModelMappings);
	}

	public DataFieldOfSheetTemplating(final DataSheet targetSheet, final DataFieldOfSheet source, final Map<Long, DataModel> dataModelMappings) {
		super(targetSheet, source, dataModelMappings);
	}
	
	@Override
	protected DataSheet copyListDataSheet(DataSheetModel copy, DataSheet source) throws IOException {
		
		final DataSheet targetSheetList;
		
		final DataSheetModel sourceModel = this.source.model();
		final ListDataFieldOfSheet sourceListOfSheet = (ListDataFieldOfSheet)this.source;
		final DataSheetModel sourceListModel = sourceListOfSheet.sheetToRefer().model();
		
		if(sourceModel.activity().id().equals(sourceListModel.activity().id())) {
			// data sheet model provided by current activity
			final DataSheetSharing concreteDataSheets = new DataSheetSharingImpl(source);
			if(concreteDataSheets.any()) {
				targetSheetList = concreteDataSheets.counterpart();
			} else {
				targetSheetList = new DataSheetTemplating(copy, source, dataModelMappings).copy();
			}						 
		} else {
			// interaction
			throw new IllegalArgumentException("List field interaction is not supported !");
		}
		
		return targetSheetList;
	}

	@Override
	protected TableDataFieldOfSheetRow copyTableRow(TableDataFieldOfSheet copy, TableDataFieldOfSheetRow source) throws IOException {
		
		final TableDataFieldOfSheetRow newRow;
		final DataSheetSharing concreteDataSheets = new DataSheetSharingImpl(source);
		if(concreteDataSheets.any()) {
			newRow = new PxTableDataFieldOfSheetRow(concreteDataSheets.counterpart()); 
		} else {
			newRow = copy.rows().add();	
		}
		
		new DataSheetTemplating(source, newRow, dataModelMappings).copy();
		
		return newRow;
	}

}