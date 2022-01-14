package com.minlessika.supervisor.indicator;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.UUID;

import com.minlessika.sdk.datasource.Base;
import com.minlessika.sdk.datasource.RecordSet;
import com.minlessika.sdk.datasource.Recordable;
import com.minlessika.sdk.metadata.Field;
import com.minlessika.sdk.metadata.Relation;
import com.minlessika.supervisor.domain.DataFieldType;
import com.minlessika.supervisor.domain.bi.AggregateFunc;

@com.minlessika.sdk.metadata.Recordable(
		name="supervisor_indicator_dynamic_param", 
		label="Paramètre dynamique d'indicateur",
		inheritFields=false
)
public interface IndicatorDynamicParam extends IndicatorTypeDynamicParam {

	@Field(
		label="Indicateur", 
		rel=Relation.MANY2ONE
	)
	Indicator indicator() throws IOException;
	
	@Field(
		label="Origine", 
		rel=Relation.MANY2ONE
	)
	IndicatorTypeDynamicParam origin() throws IOException;
	
	@Field(label="Fonction d'agrégation")
	AggregateFunc aggregateFunc() throws IOException;
	
	void update(AggregateFunc func) throws IOException;
	
	IndicatorDynamicParam EMPTY = new IndicatorDynamicParam() {
		
		@Override
		public String tag() throws IOException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Long ownerId() throws IOException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <T extends Recordable> RecordSet<T> listOf(Class<T> clazz) throws IOException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Long lastModifierId() throws IOException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public LocalDateTime lastModificationDate() throws IOException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Long id() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public UUID guid() throws IOException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Long creatorId() throws IOException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public LocalDateTime creationDate() throws IOException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Base base() {
			return Base.EMPTY;
		}
		
		@Override
		public DataFieldType type() throws IOException {
			return DataFieldType.NONE;
		}
		
		@Override
		public int order() throws IOException {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public String name() throws IOException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public IndicatorType indicatorType() throws IOException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String code() throws IOException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public IndicatorTypeParamCategory category() throws IOException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void update(AggregateFunc func) throws IOException {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public IndicatorTypeDynamicParam origin() throws IOException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Indicator indicator() throws IOException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public AggregateFunc aggregateFunc() throws IOException {
			return AggregateFunc.NONE;
		}

		@Override
		public <T extends Recordable> RecordSet<T> listOf(Class<T> clazz, String viewScript) throws IOException {
			// TODO Auto-generated method stub
			return null;
		}
	};
}