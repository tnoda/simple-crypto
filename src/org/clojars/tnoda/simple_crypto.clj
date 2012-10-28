(ns org.clojars.tnoda.simple-crypto
  (import (java.security Key)
          (javax.crypto Cipher)
          (javax.crypto.spec SecretKeySpec)))

(defn- ^Key secret
  [^String s]
  (SecretKeySpec. (.getBytes s) "AES"))

(defn ^bytes encrypt
  [^String s ^String key]
  (let [cipher (doto (Cipher/getInstance "AES/ECB/PKCS5Padding")
                 (.init Cipher/ENCRYPT_MODE (secret key)))]
    (.doFinal cipher (.getBytes s "UTF-8"))))

(defn ^String decrypt
  [^bytes buf ^String key]
  (let [cipher (doto (Cipher/getInstance "AES/ECB/PKCS5Padding")
                 (.init Cipher/DECRYPT_MODE (secret key)))]
    (String. (.doFinal cipher buf) "UTF-8")))
