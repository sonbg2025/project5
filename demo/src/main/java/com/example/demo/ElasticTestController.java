//package com.example.demo;
//import co.elastic.clients.elasticsearch.ElasticsearchClient;
//import co.elastic.clients.elasticsearch.core.GetRequest;
//import co.elastic.clients.elasticsearch.core.GetResponse;
//import co.elastic.clients.elasticsearch.core.IndexRequest;
//import co.elastic.clients.elasticsearch.core.IndexResponse;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.io.IOException;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/es")
//@Slf4j
//public class ElasticTestController {
//
//    @Autowired
//    private ElasticSearchConfig elasticSearchConfig;
//
//    // 문서 추가
//    @PostMapping("/doc")
//    public String addDoc(@RequestBody Map<String, Object> doc) throws IOException {
//        System.out.println("./es/doc 시작");
//        log.info("doc: {}");
//        ElasticsearchClient client = elasticSearchConfig.getClient();
//        IndexRequest<Map<String, Object>> request = IndexRequest.of(b -> b
//                .index("test-index")
//                .document(doc)
//        );
//        IndexResponse response = client.index(request);
//        return "생성된 문서 ID: " + response.id();
//    }
//
//    // 문서 조회
//    @GetMapping("/doc/{id}")
//    public Object getDoc(@PathVariable String id) throws IOException {
//        System.out.println("./es/doc/id 시작");
//        log.info("doc2: {}");
//        ElasticsearchClient client = elasticSearchConfig.getClient();
//        GetRequest getRequest = GetRequest.of(b -> b
//                .index("test-index")
//                .id(id)
//        );
//        GetResponse<Map> response = client.get(getRequest, Map.class);
//        if (response.found()) {
//            return response.source();
//        } else {
//            return "문서를 찾을 수 없습니다.";
//        }
//    }
//}
