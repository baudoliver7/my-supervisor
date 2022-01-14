<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
                version="2.0">
	<xsl:output method="html" cdata-section-elements="script style" include-content-type="no" doctype-system="about:legacy-compat" encoding="UTF-8" indent="yes"/>
  	<xsl:strip-space elements="*"/>
  	<xsl:include href="/com/supervisor/xsl/layout.xsl"/>
  	<xsl:template match="page" mode="head">
	    <title>
	      <xsl:text>Supervisor - Minlessika - Configurer les modèles agrégés</xsl:text>
	    </title>
	</xsl:template>
	<xsl:template match="page" mode="body">
		<div class="col-12">
           <div class="card">
             <div class="card-header">
               <h3 class="card-title">Modèles agrégés</h3>         
               <div class="card-options">
                  <a role="button" class="btn btn-primary" href="/collect/aggregated-model/edit">
                  	<i class="fa fa-plus"></i> Nouveau
                  </a>
                </div>      
             </div>
             <div class="table-responsive">
               <table class="table card-table table-vcenter text-nowrap">
                 <thead>
                   <tr>
                     <th class="w-1">N°</th>
                     <th>Code</th>
                     <th>Libellé</th>
                     <th>Activité</th>
                     <th>Modèle de base</th>
                     <th></th>
                     <th></th>
                   </tr>
                 </thead>
                 <tbody>
                 	<xsl:for-each select="aggregated_models/aggregated_model">
                    	<tr>
	                     <td><span class="text-muted"><xsl:value-of select="position()"/></span></td>
	                     <td><xsl:value-of select="code"/></td>
	                     <td><xsl:value-of select="name"/></td>
	                     <td><xsl:value-of select="activity"/></td>
	                     <td>
	                       <xsl:value-of select="model"/>
	                     </td>
	                     <td>
	                       <a class="icon" href="/collect/aggregated-model/edit?id={id}">
	                         <i class="fe fe-edit"></i>
	                       </a>
	                     </td>
	                     <td>
	                       <a class="icon" href="/collect/aggregated-model/delete?id={id}" onclick="return confirm('Voulez-vous supprimer ce modèle ?');">
	                         <i class="fe fe-trash"></i>
	                       </a>
	                     </td>
	                   </tr>
                    </xsl:for-each>                   
                 </tbody>
               </table>
             </div>
           </div>
        </div>
	</xsl:template>  		
	<xsl:template match="page" mode="customScript"></xsl:template>
</xsl:stylesheet>