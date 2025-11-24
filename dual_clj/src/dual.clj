(ns dual
  (:require [clj-http.client :as client]))



(->>
 (client/get "http://dual-basilisp:8000/text-to-doc"
             {:query-params {:text "Barack Obama was born in Hawaii. He was elected president in 2008."}
              :as :json})
 :body
 :doc

 first
 (map #(select-keys % [:multi_ner :lemma])))

  