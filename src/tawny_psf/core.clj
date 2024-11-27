(ns tawny-psf.core
  (:use [tawny owl pattern]))


(defontology psf
  :iri "http://example.com/psf")

(defaproperty hasIdentifier)

(defoproperty previousEquivalent)

(defclass Dimension)

(deftier SubDimension
  [AreaOfActivity CoreKnowledge ProfessionalValues]
  :super Dimension)

(defclass Descriptors)
