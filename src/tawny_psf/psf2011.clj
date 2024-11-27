(ns tawny-psf.psf2011
  (:use [tawny owl pattern])
  (:require [tawny-psf.core :as core]))

(defontology psf2011
  :iri "http://example.com/psf2011"
  :noname true)

(deftier Areas
  [DesignAndPlan TeachAndSupport Assess Develop Engage]
  :super core/AreaOfActivity)

(refine
 DesignAndPlan
 :label "Define and plan learning activities and/or programmes of study"
 :annotation (annotation core/hasIdentifier "A1"))
