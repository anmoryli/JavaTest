import java.io.File;

/**
 * 抽象组件：表示文件和文件夹的共同行为
 */
interface FileComponent {
    void create(); // 创建文件或文件夹
    void display(int level); // 显示结构（用于调试）
}

/**
 * 叶子节点：表示文件
 */
class FileNode implements FileComponent {
    private String name;
    private String path;

    public FileNode(String path, String name) {
        this.path = path;
        this.name = name;
    }

    @Override
    public void create() {
        File file = new File(path + "/" + name);
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("文件创建成功: " + file.getAbsolutePath());
            } else {
                System.out.println("文件已存在: " + file.getAbsolutePath());
            }
        } catch (Exception e) {
            System.err.println("创建文件失败: " + e.getMessage());
        }
    }

    @Override
    public void display(int level) {
        System.out.println("-".repeat(level * 2) + " File: " + name);
    }
}

/**
 * 组合节点：表示文件夹
 */
class DirectoryNode implements FileComponent {
    private String name;
    private String path;
    private java.util.List<FileComponent> children = new java.util.ArrayList<>();

    public DirectoryNode(String path, String name) {
        this.path = path;
        this.name = name;
    }

    public void add(FileComponent component) {
        children.add(component);
    }

    @Override
    public void create() {
        File dir = new File(path + "/" + name);
        if (!dir.exists()) {
            dir.mkdirs(); // 创建文件夹（包括父目录）
            System.out.println("文件夹创建成功: " + dir.getAbsolutePath());
        } else {
            System.out.println("文件夹已存在: " + dir.getAbsolutePath());
        }

        // 递归创建子节点
        for (FileComponent child : children) {
            child.create();
        }
    }

    @Override
    public void display(int level) {
        System.out.println("-".repeat(level * 2) + " Directory: " + name);
        for (FileComponent child : children) {
            child.display(level + 1);
        }
    }
}

/**
 * 主类：使用组合模式创建文件夹和文件结构
 */
public class Mkdir {
    public static void main(String[] args) {
        // 根目录
        DirectoryNode root = new DirectoryNode("D:", "test");

        // 子目录和文件
        DirectoryNode subDir1 = new DirectoryNode("D:/test", "subDir1");
        FileNode file1 = new FileNode("D:/test", "file1.txt");
        FileNode file2 = new FileNode("D:/test/subDir1", "file2.txt");

        // 构建树结构
        root.add(subDir1);
        root.add(file1);
        subDir1.add(file2);

        // 显示结构
        System.out.println("文件结构：");
        root.display(0);

        // 创建文件夹和文件
        System.out.println("\n创建文件和文件夹：");
        root.create();
    }
}