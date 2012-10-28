(ns org.clojars.tnoda.simple-crypto-test
  (:use clojure.test
        org.clojars.tnoda.simple-crypto))

(deftest test-simple-crypto
  (testing "encryption and decryption"
    (is (= (-> "foo"
               (encrypt "0123456789abcdef")
               (decrypt "0123456789abcdef"))
           "foo"))))
