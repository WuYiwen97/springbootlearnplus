package com.wyw.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TreeNode<T> {
    //数据内容
    private T data;
    //这个节点下的子节点
    private List<TreeNode<T>> childrenNode = new ArrayList<>();


//    public List<TreeNode<T>> childrenNode(List<T> datas, String idName, String fidName) {
//        ConvertTree<T> convertTree = new ConvertTree<>();
//        String idValue = convertTree.getFieldValue(data, idName);
//        List<T> collect = datas.stream()
//                .filter(date -> idValue.equals(convertTree.getFieldValue(date, fidName)))
//                .collect(Collectors.toList());
//        datas.removeAll(collect);
//        for (T node : collect) {
//            TreeNode<T> treeNode = new TreeNode<>();
//            treeNode.setData(node);
//            childrenNode.add(treeNode);
//        }
//        return childrenNode;
//    }

}