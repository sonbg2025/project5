//package com.example.demo;
//
//import co.elastic.clients.elasticsearch.ElasticsearchClient;
//import co.elastic.clients.transport.rest_client.RestClientTransport;
//import co.elastic.clients.json.jackson.JacksonJsonpMapper;
//import org.apache.http.HttpHost;
//import org.elasticsearch.client.RestClient;
//import org.elasticsearch.client.RestClientBuilder;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import java.io.FileInputStream;
//import java.security.KeyStore;
//import java.security.cert.CertificateFactory;
//import java.security.cert.X509Certificate;
//import javax.net.ssl.SSLContext;
//import javax.net.ssl.TrustManagerFactory;
//
//@Component
//public class ElasticSearchConfig {
//
//    @Value("${elasticsearch.serverUrl}")
//    private String serverUrl;
//
//    @Value("${elasticsearch.apiKey}")
//    private String apiKey;
//
//    @Value("${elasticsearch.caPath}")
//    private String caPath;
//
//    private ElasticsearchClient client;
//
//    @PostConstruct
//    public void init() throws Exception {
//        // 1. CA 인증서 로드
//        CertificateFactory factory = CertificateFactory.getInstance("X.509");
//        FileInputStream fis = new FileInputStream(caPath);
//        X509Certificate caCert = (X509Certificate) factory.generateCertificate(fis);
//
//        KeyStore trustStore = KeyStore.getInstance("pkcs12");
//        trustStore.load(null, null);
//        trustStore.setCertificateEntry("ca", caCert);
//
//        TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
//        tmf.init(trustStore);
//
//        SSLContext sslContext = SSLContext.getInstance("TLS");
//        sslContext.init(null, tmf.getTrustManagers(), null);
//
//        // 2. RestClientBuilder 생성
//        RestClientBuilder builder = RestClient.builder(HttpHost.create(serverUrl))
//                .setHttpClientConfigCallback(httpClientBuilder ->
//                        httpClientBuilder
//                                .setSSLContext(sslContext)
//                                .setDefaultHeaders(
//                                        java.util.Arrays.asList(
//                                                new org.apache.http.message.BasicHeader("Authorization", "ApiKey " + apiKey)
//                                        )
//                                )
//                );
//
//        RestClient restClient = builder.build();
//        RestClientTransport transport = new RestClientTransport(restClient, new JacksonJsonpMapper());
//        client = new ElasticsearchClient(transport);
//    }
//
//    public ElasticsearchClient getClient() {
//        return client;
//    }
//}
