(ns tawny-psf.psf-2023.clj
  (:use [tawny owl pattern])
  (:require
   [tawny-psf.core :as core]
   [tawny-psf.psf2011 :as psf2011]))

(defontology psf2023
  :iri "http://example.com/psf2023"
  :noname true)

(deftier Areas
  [DesignAndPlan TeachAndSupport Assess SupportAndGuide EnhancePractice]
  :super core/AreaOfActivity)

(refine
 DesignAndPlan
 :super
 (owl-some core/previousEquivalent psf2011/DesignAndPlan)
 :label "Define and plan learning activities and/or programmes of study"
 :annotation
 (annotation core/hasIdentifier "A1"))
