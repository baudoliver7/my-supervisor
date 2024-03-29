<?xml version="1.0" encoding="UTF-8"?>
<!--
Copyright (c) 2018-2022 Minlessika

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to read
the Software only. Permissions is hereby NOT GRANTED to use, copy, modify,
merge, publish, distribute, sublicense, and/or sell copies of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
-->
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
  <xsl:output method="html" cdata-section-elements="script style" include-content-type="no" doctype-system="about:legacy-compat" encoding="UTF-8" indent="yes"/>
  <xsl:strip-space elements="*"/>
  <xsl:include href="/xsl/layout.xsl"/>
  <xsl:template match="page" mode="head">
    <title>
      <xsl:text>Supervisor - Minlessika - Partager</xsl:text>
    </title>
  </xsl:template>
  <xsl:template match="page" mode="body">
    <div class="col-12">
      <form class="card" action="/sharing/share?type={resource/type_id}&amp;resource={resource/id}" method="post" ng-controller="AppCtrl as vm">
        <div class="card-header">
          <h3 class="card-title">
            <xsl:text>Partager - </xsl:text>
            <i>
              <xsl:value-of select="resource/name"/>
            </i>
          </h3>
        </div>
        <div class="card-body">
          <div class="row">
            <div class="col-md-12 mb-0">
              <label class="form-label">Abonnés (<a href="javascript:void(0)" ng-click="vm.add()"><i class="fa fa-plus"/> Nouvel utilisateur</a>)</label>
              <div class="table-responsive form-control">
                <table class="table card-table table-vcenter text-nowrap">
                  <thead>
                    <tr>
                      <th class="w-1">N°</th>
                      <th>Adresse mail</th>
                      <th/>
                    </tr>
                  </thead>
                  <tbody>
                    <tr ng-repeat="item in vm.subscribers">
                      <td>
                        <span class="text-muted">{{$index + 1}}</span>
                        <input hidden="" type="text" name="item_email" ng-model="item.email"/>
                      </td>
                      <td>
                        <input ng-model="item.email" type="text" class="form-control" placeholder="Saisir une adresse mail" required=""/>
                      </td>
                      <td>
                        <a class="icon" ng-click="vm.remove($index)">
                          <i class="fe fe-trash"/>
                        </a>
                      </td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </div>
        <div class="card-footer text-right">
          <div class="d-flex">
            <a href="/sharing?type={resource/type_id}&amp;resource={resource/id}" class="btn btn-link">Annuler</a>
            <button type="submit" class="btn btn-primary ml-auto">Partager</button>
          </div>
        </div>
      </form>
    </div>
  </xsl:template>
  <xsl:template match="page" mode="customScript">
    <script type="text/javascript"><![CDATA[		
            var app = angular.module("app", [])
				                 .config(["$provide", function($provide){
							        
				                 }]);			
	
			app.controller("AppCtrl", ["$scope", function ($scope) {
				   var vm = this;
				   		
				   vm.subscribers = []]><xsl:for-each select="subscribers/subscriber">                             	                     
	                       	{
	                       		'email': "<xsl:value-of select="email"/>"
	                       	},
	                   </xsl:for-each><![CDATA[];
	                    	
				   
				   vm.add = function(){
				   		vm.subscribers.push({});
				   }
				   
				   vm.remove = function(index){	
				   		vm.subscribers.splice(index, 1);
				   }
				   
				   this.$onInit = function(){
						if(vm.subscribers.length == 0)
							vm.add();
				   };
		    }]);	
			
			angular.bootstrap(document, ['app']);				
        ]]></script>
  </xsl:template>
</xsl:stylesheet>
