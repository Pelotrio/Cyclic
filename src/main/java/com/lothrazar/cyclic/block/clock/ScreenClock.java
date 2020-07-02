package com.lothrazar.cyclic.block.clock;

import com.lothrazar.cyclic.base.ScreenBase;
import com.lothrazar.cyclic.gui.ButtonMachine;
import com.lothrazar.cyclic.gui.TextboxInteger;
import com.lothrazar.cyclic.registry.TextureRegistry;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.text.ITextComponent;

public class ScreenClock extends ScreenBase<ContainerClock> {

  final int PAD = 8;
  int w = 18, h = 15;
  int rowOffset = PAD / 2;
  int colOffset = PAD / 4;
  int xCol1 = 4;
  int xCol2 = xCol1 + w + colOffset;
  int xColText = xCol2 + 34;
  int xCol3 = xColText + 24;
  int xCol4 = xCol3 + w + colOffset;
  int yRow1 = PAD * 3 + rowOffset;
  int yRow2 = yRow1 + h + colOffset;
  int yRow3 = yRow2 + h + colOffset;
  int xColFacing = xCol4 + w + PAD;
  private ButtonMachine btnEntity;
  private ButtonMachine btnComp;
  private TextboxInteger txtX;
  private TextboxInteger txtY;
  private TextboxInteger txtZ;
  private TextboxInteger txtLimit;

  public ScreenClock(ContainerClock screenContainer, PlayerInventory inv, ITextComponent titleIn) {
    super(screenContainer, inv, titleIn);
  }

  @Override
  public void init() {
    super.init();
    int x, y;
    x = guiLeft + 96;
    y = guiTop + 18;
    //    btnEntity = addButton(new ButtonMachine(x, y, 50, 20, "", (p) -> {
    //      int f = TileDetector.Fields.ENTITYTYPE.ordinal();
    //      PacketRegistry.INSTANCE.sendToServer(new PacketTileData(f,
    //          container.tile.getField(f) + 1, container.tile.getPos()));
    //    }));
    //    y += 28;
    //    btnComp = addButton(new ButtonMachine(x, y, 50, 20, "", (p) -> {
    //      int f = TileDetector.Fields.GREATERTHAN.ordinal();
    //      PacketRegistry.INSTANCE.sendToServer(new PacketTileData(f,
    //          container.tile.getField(f) + 1, container.tile.getPos()));
    //    }));
    //    x = guiLeft + 8;
    //    y = guiTop + 18;
    //    txtX = new TextboxInteger(this.font, x, y, 20,
    //        container.tile.getPos(), TileDetector.Fields.RANGEX.ordinal());
    //    txtX.setText("" + container.tile.getField(TileDetector.Fields.RANGEX.ordinal()));
    //    txtX.setTooltip(UtilChat.lang("cyclic.detector.rangex"));
    //    this.children.add(txtX);
    //    //y 
    //    x += 30;
    //    txtY = new TextboxInteger(this.font, x, y, 20,
    //        container.tile.getPos(), TileDetector.Fields.RANGEY.ordinal());
    //    txtY.setText("" + container.tile.getField(TileDetector.Fields.RANGEY.ordinal()));
    //    txtY.setTooltip(UtilChat.lang("cyclic.detector.rangey"));
    //    this.children.add(txtY);
    //    x += 30;
    //    txtZ = new TextboxInteger(this.font, x, y, 20,
    //        container.tile.getPos(), TileDetector.Fields.RANGEZ.ordinal());
    //    txtZ.setText("" + container.tile.getField(TileDetector.Fields.RANGEZ.ordinal()));
    //    txtZ.setTooltip(UtilChat.lang("cyclic.detector.rangez"));
    //    this.children.add(txtZ);
    //    x = guiLeft + 38;
    //    y += 28;
    //    txtLimit = new TextboxInteger(this.font, x, y, 20,
    //        container.tile.getPos(), TileDetector.Fields.LIMIT.ordinal());
    //    txtLimit.setText("" + container.tile.getField(TileDetector.Fields.LIMIT.ordinal()));
    //    txtLimit.setTooltip(UtilChat.lang("cyclic.detector.limit"));
    //    this.children.add(txtLimit);
  }

  @Override
  public void removed() {
    this.txtX = null;
    this.txtY = null;
    this.txtZ = null;
    this.txtLimit = null;
  }

  @Override
  public void render(int mouseX, int mouseY, float partialTicks) {
    this.renderBackground();
    super.render(mouseX, mouseY, partialTicks);
    //    this.txtX.render(mouseX, mouseX, partialTicks);
    //    this.txtY.render(mouseX, mouseX, partialTicks);
    //    this.txtZ.render(mouseX, mouseX, partialTicks);
    //    this.txtLimit.render(mouseX, mouseX, partialTicks);
    this.renderHoveredToolTip(mouseX, mouseY);
  }

  @Override
  protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
    this.drawButtonTooltips(mouseX, mouseY);
    this.drawName(this.title.getFormattedText());
    //    btnEntity.setTooltip(UtilChat.lang("cyclic.detector.entitytype.tooltip"));
    //    btnEntity.setMessage(UtilChat.lang("cyclic.detector.entitytype" +
    //        container.tile.getField(TileDetector.Fields.ENTITYTYPE.ordinal())));
    //    btnComp.setTooltip(UtilChat.lang("cyclic.detector.compare.tooltip"));
    //    btnComp.setMessage(UtilChat.lang("cyclic.detector.compare" +
    //        container.tile.getField(TileDetector.Fields.GREATERTHAN.ordinal())));
  }

  @Override
  protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
    this.drawBackground(TextureRegistry.INVENTORY);
  }
}
