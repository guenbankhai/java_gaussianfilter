import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

public class GaussFilterForm extends JFrame {
    public GaussFilterForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Nguyễn Văn Khải
        pnKernel = new JPanel();
        lbKernel = new JLabel();
        spnKernel = new JSpinner();
        lblStandardDeviation = new JLabel();
        spnStandardDeviation = new JSpinner();
        pnImage = new JPanel();
        btnImage = new JButton();
        btnResult = new JButton();
        lblCredit = new JLabel();

        //======== this ========
        var contentPane = getContentPane();

        //======== pnKernel ========
        {
            pnKernel.setBorder(new TitledBorder("B\u1ed9 l\u1ecdc Gauss"));

            //---- lbKernel ----
            lbKernel.setText("K\u00edch c\u1ee1:");

            //---- lblStandardDeviation ----
            lblStandardDeviation.setText("\u0110\u1ed9 l\u1ec7ch chu\u1ea9n:");

            GroupLayout pnKernelLayout = new GroupLayout(pnKernel);
            pnKernel.setLayout(pnKernelLayout);
            pnKernelLayout.setHorizontalGroup(
                pnKernelLayout.createParallelGroup()
                    .addGroup(pnKernelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnKernelLayout.createParallelGroup()
                            .addComponent(lblStandardDeviation)
                            .addComponent(lbKernel, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(pnKernelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(spnKernel, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(spnStandardDeviation))
                        .addContainerGap())
            );
            pnKernelLayout.setVerticalGroup(
                pnKernelLayout.createParallelGroup()
                    .addGroup(pnKernelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnKernelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lbKernel)
                            .addComponent(spnKernel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnKernelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStandardDeviation)
                            .addComponent(spnStandardDeviation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
            );
        }

        //======== pnImage ========
        {
            pnImage.setBorder(new TitledBorder("\u1ea2nh"));

            //---- btnImage ----
            btnImage.setText("Ch\u1ecdn \u1ea3nh g\u1ed1c");
            btnImage.setFocusPainted(false);
            btnImage.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnImageMouseClicked(e);
                }
            });

            //---- btnResult ----
            btnResult.setText("Xu\u1ea5t \u1ea3nh");
            btnResult.setFocusPainted(false);
            btnResult.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnResultMouseClicked(e);
                }
            });

            GroupLayout pnImageLayout = new GroupLayout(pnImage);
            pnImage.setLayout(pnImageLayout);
            pnImageLayout.setHorizontalGroup(
                pnImageLayout.createParallelGroup()
                    .addGroup(pnImageLayout.createSequentialGroup()
                        .addContainerGap(78, Short.MAX_VALUE)
                        .addGroup(pnImageLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnImage, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnResult, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addContainerGap(78, Short.MAX_VALUE))
            );
            pnImageLayout.setVerticalGroup(
                pnImageLayout.createParallelGroup()
                    .addGroup(pnImageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnImage)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnResult)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        //---- lblCredit ----
        lblCredit.setText("Make By GuenBanKhai");
        lblCredit.setHorizontalAlignment(SwingConstants.CENTER);
        lblCredit.setFont(new Font("Inter", Font.PLAIN, 10));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(pnKernel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnImage, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCredit, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnKernel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(pnImage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblCredit)
                    .addContainerGap(5, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Nguyễn Văn Khải
    private JPanel pnKernel;
    private JLabel lbKernel;
    private JSpinner spnKernel;
    private JLabel lblStandardDeviation;
    private JSpinner spnStandardDeviation;
    private JPanel pnImage;
    private JButton btnImage;
    private JButton btnResult;
    private JLabel lblCredit;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private BufferedImage imageOriginal;

    public static double[][] KernelGaussian(int kernelSize, double standardDeviation) {
        double[][] kernel = new double[kernelSize][kernelSize];
        double sum = 0.0;
        int halfSize = kernelSize / 2;

        // Hằng số trong công thức Gaussian
        double constant = 1 / (2 * Math.PI * standardDeviation * standardDeviation);
        double twoSigmaSquare = 2 * standardDeviation * standardDeviation;

        for (int x = -halfSize; x <= halfSize; x++) {
            for (int y = -halfSize; y <= halfSize; y++) {
                // Công thức hàm Gaussian 2D
                double exponent = -(x * x + y * y) / twoSigmaSquare;
                kernel[x + halfSize][y + halfSize] = constant * Math.exp(exponent);

                // Cộng dồn để tính tổng
                sum += kernel[x + halfSize][y + halfSize];
            }
        }

        for (int i = 0; i < kernelSize; i++) {
            for (int j = 0; j < kernelSize; j++) {
                kernel[i][j] /= sum;
            }
        }

        return kernel;
    }

    public static BufferedImage GaussianFilter(double[][] kernel, BufferedImage img) {
        int width = img.getWidth();
        int height = img.getHeight();
        int kernelSize = kernel.length;
        BufferedImage result = new BufferedImage(width, height, img.getType());

        // Duyệt qua tất cả các điểm ảnh của hình ảnh
        for (int x = kernelSize / 2; x < width - kernelSize / 2; x++) {
            for (int y = kernelSize / 2; y < height - kernelSize / 2; y++) {
                double red = 0.0, green = 0.0, blue = 0.0;

                // Tính toán trung bình trọng số với kernel
                for (int i = 0; i < kernelSize; i++) {
                    for (int j = 0; j < kernelSize; j++) {
                        int imgX = x + i - kernelSize / 2;
                        int imgY = y + j - kernelSize / 2;
                        Color color = new Color(img.getRGB(imgX, imgY));

                        red += color.getRed() * kernel[i][j];
                        green += color.getGreen() * kernel[i][j];
                        blue += color.getBlue() * kernel[i][j];
                    }
                }

                // Giới hạn giá trị từ 0 đến 255 và đặt màu cho pixel mới
                int newRed = (int) Math.min(Math.max(red, 0), 255);
                int newGreen = (int) Math.min(Math.max(green, 0), 255);
                int newBlue = (int) Math.min(Math.max(blue, 0), 255);

                // Gán giá trị pixel mới cho hình ảnh kết quả
                result.setRGB(x, y, new Color(newRed, newGreen, newBlue).getRGB());
            }
        }
        return result;
    }

    public static boolean CheckLogic(int kernelSize, double standardDeviation, BufferedImage imageOriginal) {
        // Kiểm tra nếu kernelSize là số lẻ và lớn hơn hoặc bằng 3
        if (kernelSize < 3 || kernelSize % 2 == 0) {
            new DialogNotification("Kích thước kernel phải là số lẻ và lớn hơn hoặc bằng 3!", DialogNotification.ERROR_DIALOG);
            return false;
        }

        // Kiểm tra nếu standardDeviation (độ lệch chuẩn) là một số dương
        if (standardDeviation <= 0) {
            new DialogNotification("Độ lệch chuẩn phải là một số dương!", DialogNotification.ERROR_DIALOG);
            return false;
        }

        // Kiểm tra nếu ảnh đã được tải lên thành công
        if (imageOriginal == null) {
            new DialogNotification("Ảnh chưa được tải lên!", DialogNotification.ERROR_DIALOG);
            return false;
        }

        // Kiểm tra kích thước ảnh
        int width = imageOriginal.getWidth();
        int height = imageOriginal.getHeight();
        if (width < kernelSize || height < kernelSize) {
            new DialogNotification("Kích thước bộ lọc không thể lớn hơn kích thước ảnh!", DialogNotification.ERROR_DIALOG);
            return false;
        }

        // Cảnh báo nếu kernelSize quá nhỏ so với standardDeviation
        if (kernelSize < 3 * standardDeviation) {
            DialogNotification notification = new DialogNotification("Kích thước bộ lọc có thể quá nhỏ so với độ lệch chuẩn!", DialogNotification.WARNING_DIALOG);
            if (notification.getAction() == DialogNotification.OK_OPTION) {
                return true;
            } else {
                return false;
            }
        }

        // Nếu tất cả các điều kiện đều hợp lệ
        return true;
    }

    private void btnImageMouseClicked(MouseEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chọn tệp ảnh");

        // Chỉ cho phép chọn các tệp hình ảnh (jpg, png)
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image files", "jpg", "png", "jpeg"));

        // Hiển thị hộp thoại chọn tệp
        int returnValue = fileChooser.showOpenDialog(null);

        // Nếu người dùng chọn tệp
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                // Đọc ảnh từ tệp đã chọn
                imageOriginal = ImageIO.read(selectedFile);

                // Hiển thị thông báo hoặc xử lý ảnh đã chọn nếu cần
                new DialogNotification("Đã chọn ảnh: " + selectedFile.getAbsolutePath(), DialogNotification.SUCCESS_DIALOG);
            } catch (Exception ex) {
                new DialogNotification("Lỗi khi đọc file!", DialogNotification.ERROR_DIALOG);
                ex.printStackTrace();
            }
        } else {
            new DialogNotification("Chưa chọn file!", DialogNotification.ERROR_DIALOG);
        }
    }

    private void btnResultMouseClicked(MouseEvent e) {
        // Lấy giá trị từ spnKernel và spnStandardDeviation
        int kernelSize = (Integer) spnKernel.getValue();
        Number value = (Number) spnStandardDeviation.getValue();
        double standardDeviation = value.doubleValue();

        // Kiểm tra logic
        if (!CheckLogic(kernelSize, standardDeviation, imageOriginal)) {
            return; // Dừng hàm nếu không hợp lệ
        }

        // Tính toán kernel Gaussian
        double[][] kernel = KernelGaussian(kernelSize, standardDeviation);

        // Áp dụng bộ lọc Gaussian
        BufferedImage filteredImage = GaussianFilter(kernel, imageOriginal);

        // Tạo tên file dựa trên giá trị của kernelSize và standardDeviation
        String fileName = kernelSize + "_" + standardDeviation + ".jpg";

        // Hiển thị hộp thoại chọn địa chỉ để lưu ảnh
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Lưu ảnh đã lọc");

        // Chỉ cho phép lưu tệp hình ảnh (jpg, png)
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image files", "jpg", "png"));

        // Thiết lập tên mặc định cho file dựa trên giá trị kernelSize và standardDeviation
        fileChooser.setSelectedFile(new File(fileName));

        // Hiển thị hộp thoại lưu tệp
        int returnValue = fileChooser.showSaveDialog(null);

        // Nếu người dùng chọn tệp
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                // Lưu ảnh đã lọc với định dạng JPG
                ImageIO.write(filteredImage, "jpg", selectedFile);
                new DialogNotification("Ảnh đã được lưu: " + selectedFile.getAbsolutePath(), DialogNotification.SUCCESS_DIALOG);
            } catch (Exception ex) {
                new DialogNotification("Lỗi khi lưu file!", DialogNotification.ERROR_DIALOG);
                ex.printStackTrace();
            }
        } else {
            new DialogNotification("Chưa chọn nơi lưu file!", DialogNotification.WARNING_DIALOG);
        }
    }

    public static void main(String[] args) {
        GaussFilterForm form = new GaussFilterForm();
        form.setVisible(true);
        form.setResizable(false);
        form.setSize(310, 300);
    }
}
