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
  <xsl:include href="/xsl/website_layout.xsl"/>
  <xsl:template match="page" mode="body">
    <!--Grid row-->
    <div class="row mt-5">
      <!--Grid column-->
      <div class="col-md-6 mb-5 mt-md-0 mt-5 white-text text-center text-md-left">
        <h1 class="h1-responsive font-weight-bold wow fadeInLeft" data-wow-delay="0.3s">
          <xsl:value-of select="$lang.contactUs"/>
        </h1>
        <hr class="hr-light wow fadeInLeft" data-wow-delay="0.3s"/>
        <h6 class="mb-3 wow fadeInLeft" data-wow-delay="0.3s">
          <xsl:value-of select="$lang.weAreListeningToYou"/>
        </h6>
      </div>
      <!--Grid column-->
      <!--Grid column-->
      <div class="col-md-6 col-xl-5 mb-4">
        <!--Form-->
        <form id="secure-formular" role="form" action="/contacts/send" method="post">
          <div class="z-depth-2 card wow fadeInRight" data-wow-delay="0.3s">
            <div class="card-body">
              <!--Header-->
              <div class="text-center">
                <h3 class="dark-grey-text">
                  <i class="fa fa-pencil-alt grey-text">
                    <xsl:value-of select="$lang.formTitle"/>
                  </i>
                </h3>
                <hr class="mt-2 mb-2"/>
              </div>
              <!--Body-->
              <div class="md-form">
                <i class="fa fa-user prefix grey-text"/>
                <input name="name" type="text" id="form3" class="form-control" required=""/>
                <label for="form3">
                  <xsl:value-of select="$lang.yourName"/>
                </label>
              </div>
              <div class="md-form">
                <i class="fa fa-envelope prefix grey-text"/>
                <input name="email" type="text" id="form2" class="form-control" required=""/>
                <label for="form2">
                  <xsl:value-of select="$lang.yourEmailAddress"/>
                </label>
              </div>
              <!--Textarea with icon prefix-->
              <div class="md-form">
                <i class="fa fa-pencil-alt prefix grey-text"/>
                <textarea name="message" type="text" id="form8" class="md-textarea form-control" rows="3" required=""/>
                <label for="form8">
                  <xsl:value-of select="$lang.yourMessage"/>
                </label>
              </div>
              <div class="text-center mt-3">
                <xsl:choose>
                  <xsl:when test="recaptcha/active = 'true'">
                    <button id="submitter" class="btn btn-indigo">
                      <xsl:value-of select="$lang.submitText"/>
                    </button>
                  </xsl:when>
                  <xsl:otherwise>
                    <button type="submit" class="btn btn-indigo">
                      <xsl:value-of select="$lang.submitText"/>
                    </button>
                  </xsl:otherwise>
                </xsl:choose>
              </div>
            </div>
          </div>
          <xsl:if test="recaptcha/active = 'true'">
            <div class="g-recaptcha" data-sitekey="{recaptcha/site-key}" data-badge="bottomright" data-callback="captchaSubmit" data-size="invisible"/>
          </xsl:if>
        </form>
        <!--/.Form-->
      </div>
      <!--Grid column-->
    </div>
    <!--Grid row-->
  </xsl:template>
</xsl:stylesheet>
